package com.company;

public class Magic extends Hero{


    public Magic(int health, int damage, String superAbbility) {
        super(health, damage, superAbbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Magic use his stick " );
    }
}
