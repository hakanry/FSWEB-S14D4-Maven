package org.example.rpg;

public class rpgMain {
    public static void main(String[] args) {
        Monster troll1 = new Troll("Troll1",20,5);
        System.out.println(troll1.getDamage());
        System.out.println(troll1.bleed());
        System.out.println(troll1.poison());
        System.out.println(troll1.attack());
    }
}
