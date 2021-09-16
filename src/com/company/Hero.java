package com.company;

public abstract class  Hero implements HavingSuperAbility {
     int health;
     public int damage;
     String superAbbility;

     public Hero(int health, int damage, String superAbbility) {
          this.health = health;
          this.damage = damage;
          this.superAbbility = superAbbility;
     }
}
