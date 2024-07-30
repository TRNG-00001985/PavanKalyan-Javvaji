package com.activity1;
import java.util.*;

abstract class Character{
	public String Name;
	public int Health;
	public int Level;
	public String Race;
	public int AttackPower;
	public Character(String Name,String Race,int Health,int Level,int AttackPower) {
		this.Name=Name;
		this.Health=100;
		this.Level=Level;
		this.Race=Race;
		this.AttackPower=AttackPower;
		
	}
	
	public int getAttackPower() {
		return AttackPower;
	}

	public void setAttackPower(int attackPower) {
		AttackPower = attackPower;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getHealth() {
		return Health;
	}
	public void setHealth(int health) {
		Health = health;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public  void AttackHealth() {
		this.Health-=30;
		if(this.Health<=0) {
			this.Health=0;
		}
		System.out.println(Health);
	}
	public void DrinkHealth() {
		this.Health+=50;
		if(this.Health>=100) {
			this.Health=100;
		}
		System.out.println(Health);
	}
	public abstract void Ability(Character Visibility);
	
}

public class LordOfRingsActivity {

	public static void main(String[] args) {
       Character character=new Elf("Grindal","Race1", 20,10, 50);
		Creature creature=new Dragon(30, 40);
		Combat war=new Combat();
		war.Battle(character, null, creature);
		
		
	}

}
