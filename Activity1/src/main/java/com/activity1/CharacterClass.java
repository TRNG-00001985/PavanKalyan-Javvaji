/**
 * 
 */
package com.activity1;

/**
 * 
 */
public interface CharacterClass {
 
	
	
	public void Ability(Character Visibility);
}

class Ranger implements CharacterClass{

	@Override
	public void Ability(Character Visibility) {
        System.out.println("Ranger Tracking");		
	}
	
}
class Wizard implements CharacterClass{

	@Override
	public void Ability(Character Visibility) {
        System.out.println("Wizard spellcasting")	;	
	}
	
}
class Warrior implements CharacterClass{

	@Override
	public void Ability(Character Visibility) {
     System.out.println("Warrior combat prowess");		
	}
	
}
 class Commoner implements CharacterClass{

	@Override
	public void Ability(Character Visibility) {
		
		System.out.println("Commoner");
	}
	 
	
}
