package com.activity1;

public class Combat {
    public void Battle(Character character,CharacterClass characterclass,Creature creature) {
    	System.out.println("The Battle b/w "+character.getName()+"  "+"and"+" "+creature.getName());
    	System.out.println(character.getName()+"Charcter Health"+character.getHealth()+"character power"+character.getAttackPower()+"\n"+creature.getName()+"Creture Health"+creature.Health+"creature power"+creature.getPower());
    	while(character.getHealth()>0 && creature.getHealth()>0) {
    		character.AttackHealth();
    		creature.attackHealth(character.getAttackPower());
    		if(character.getHealth()<10 && creature.getHealth()>character.getHealth()) {
    			character.DrinkHealth();
    		}
    	}
    	if(character.getHealth()>0) {
    		System.out.println(character.getName()+"  Won This Battle");
    	}
    	else {
    		System.out.println(creature.getName()+"   Won this Battle");
    	}
    }
}
