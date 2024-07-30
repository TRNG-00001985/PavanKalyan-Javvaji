package com.activity1;

public abstract class Creature {
      public  int Health;
      public int Power;
      public String Race;
      
      
	public abstract  void Attack();
	public Creature(String Race,int Health,int Power) {
		this.Health=Health;
		this.Power=Power;
		this.Race=Race;
	}
	public int getHealth() {
		return Health;
	}
	public void setHealth(int health) {
		Health = health;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.Race;
	}
	public void attackHealth(int Power){
		this.Health-=Power;
		if(this.Health<0) {
			this.Health=0;
		}
	
	}

	
	
//	public void  Ability(Character Visibility);
     
}


