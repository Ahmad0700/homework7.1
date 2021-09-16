package com.company;

public class Medic extends Hero{


    public Medic(int health, int damage, String superAbbility) {
        super(health, damage, superAbbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Medic to be a monster ");
    }
}
