package com.company;

public class warrior extends Hero{


    public warrior(int health, int damage, String superAbbility) {
        super(health, damage, superAbbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println( " Warrior want to kill ");
    }
}
