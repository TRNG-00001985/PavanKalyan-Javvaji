create database EmployeeDatabaseSchema;
use EmployeeDatabaseSchema;
create table Employee(
EmployeeId int primary key,
EmployeeName varchar(50),
DepartmentId int
);
create table Departments(
DepartmentId int,
DepartmentName varchar(50));
create table projects(
ProjectsId int primary key,
ProjectsName varchar(50),
DepartmentId int
);

alter table Departments add primary key(DepartmentId);
alter table Employee
add 
foreign key(DepartmentId) references Departments(DepartmentId);
alter table projects
add 
foreign key(DepartmentId) references Departments(DepartmentId);
insert into Departments(DepartmentId,DepartmentName)
values
(1,"Sales"),
(2,"HR"),
(3,"IT"),
(4,"Marketing"),
(5,"");
select * from Departments;
select * from Employee;
update Departments set DepartmentName="null" where DepartmentId=5;
select * from Departments;
insert into Employee(EmployeeId,EmployeeName,DepartmentId)
values 
(1,"John",1),
(2,"Jone",2),
(3,"Mark",1),
(4,"Emily",3),
(5,"Karen",5);
insert into projects(ProjectsId,ProjectsName,DepartmentId)
values
(101,"ProjectA",1),
(102,"ProjectB",2),
(103,"ProjectC",3),
(104,"ProjectD",4),
(105,"ProjectE",null);
select * from projects;
select * from Employee;
-- Retrieve the list of employees along with their department names where employees are associated with departments. 
select  Employee.EmployeeName,Departments.DepartmentName from Employee INNER JOIN Departments on Employee.EmployeeId=Departments.DepartmentId; 
-- Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL. 

  select Employee.EmployeeName from Employee left join Departments on Employee.EmployeeName=Departments.DepartmentName;
  -- Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.
  select Employee.EmployeeName ,Departments.DepartmentName from Departments left join Employee on Departments.DepartmentId=Employee.EmployeeId;
 --  Retrieve all possible combinations of employees and projects.
 select Employee.EmployeeId,Employee.EmployeeName,projects.ProjectsId,projects.ProjectsName from Employee cross join projects;
 -- Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.
 select EmployeeName ,DepartmentId from Employee where DepartmentId>(select DepartmentId from Departments where DepartmentName='HR');
-- Retrieve the list of projects along with their department names, where the projects are associated with departments
select projects.ProjectsName,Departments.DepartmentName from projects inner join Departments on projects.ProjectsId=Departments.DepartmentId;
-- Find employees who are not assigned to any department
select Employee.EmployeeName from Employee left join Departments on Employee.EmployeeId=Departments.DepartmentId where Employee.DepartmentId is null;
-- Find departments that have no employees
select Departments.DepartmentName from Departments left join Employee on Departments.DepartmentId=Employee.EmployeeId where Employee.EmployeeId is null;
-- Find all departments along with the number of employees in each department
select Departments.DepartmentName,count(Employee.EmployeeId) as num_Employee
from Departments inner join Employee 
on Departments.DepartmentId=Employee.DepartmentId 
group by Departments.DepartmentName;


-- Find the names of employees who work in the same department as 'John'
select EmployeeName from Employee
where DepartmentId in (select DepartmentId from Employee where EmployeeName='John');
-- Find departments that have more than one employee
select DepartmentName from Departments
where DepartmentId in (select EmployeeId  from Employee group by DepartmentId having count(EmployeeId>1));


-- Find the projects that are not assigned to any department
select * from Departments;
select * from projects;
select ProjectsName from projects
where DepartmentId is null; 
-- Find the department with the maximum number of employees.
select DepartmentName from Departments
where DepartmentId in (select DepartmentId from Departments group by DepartmentId order by DepartmentId desc) limit 1;
-- Find employees who are working on projects in the 'Sales' department.
select  EmployeeName from Employee
where DepartmentId in (select DepartmentId from Departments where DepartmentName='Sales'); 
-- Find the names of departments that do not have any projects.
select DepartmentName from Departments
where DepartmentId not in (select DepartmentId from projects where DepartmentId is not null);
-- Find the department names and the number of employees in each department, only for departments with more than two employees.
select DepartmentName,count(Employee.EmployeeId) as EmployeeCount from Departments join Employee on Departments.DepartmentId=Employee.EmployeeId
group by Departments.DepartmentName having count(Employee.EmployeeId)>2;
-- Find the projects handled by employees in the 'IT' department
select projects.ProjectsName,Employee.EmployeeName from projects join Employee on Employee.EmployeeId=projects.ProjectsId
where Employee.DepartmentId in (select DepartmentId from Departments where DepartmentName="HR");
-- Find the names of employees who do not work in the 'Marketing' department.
select EmployeeName from Employee 
where DepartmentId not in(select  DepartmentId from Departments where DepartmentName="Marketing");