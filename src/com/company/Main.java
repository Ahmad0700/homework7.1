package com.company;

public class Main {

    public static void main(String[] args) {


        warrior warrior = new warrior(100, 50, "St");
        Magic magic = new Magic(150, 30, "hj");
        Medic medic = new Medic(200, 10, "f");
        Hero[] superHero = {warrior, magic, medic};
        for (int i = 0; i < superHero.length; i++) {
         superHero[i].applySuperAbility("HJf");

        }
    }
}
