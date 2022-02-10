package com;

public class Main {

    public static void main(String[] args) {

        Player1 player = new Player1("Alex","Ak47",100);

//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

//        player.damageByGun1();
//        player.damageByGun1();
//        player.damageByGun2();
//        player.heal();

        Player2 anotherPlayer = new Player2("Sam","M249",90,false);

        System.out.println(anotherPlayer.getName());
        System.out.println(anotherPlayer.getHealth());
        System.out.println(anotherPlayer.getWeapon());

        anotherPlayer.damageByGun1();
        anotherPlayer.damageByGun2();
        anotherPlayer.heal();
    }
}
