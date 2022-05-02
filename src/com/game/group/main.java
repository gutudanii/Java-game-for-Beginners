package com.game.group;

import java.util.Scanner;


public class main {
    public void menu(){
        Scanner inp = new Scanner(System.in);
        loveCalculator lv = new loveCalculator();
        mindTest mt = new mindTest();
        whoAmI wh = new whoAmI();
        int num;
        System.out.println("\n\n\n\t\t=================================================================");
        System.out.println("\n\t\t\t\t\tWEL - COME TO FUN STORE GAME");
        System.out.println("\n\t\t\t\t\t\t\t1.Start Game");
        System.out.println("\t\t\t\t\t\t\t2.Exit");
        System.out.println("\n\t\t=================================================================");
        System.out.print("\n\t\t\t\t\tChoose = ");
        num = inp.nextInt();


        if(num==1){
            System.out.println("\n\n\t\t=================================================================");
            System.out.println("\n\t\t\t\t\t Here There are two simple games available Here " +
                    "\n\t\t\t\t\t\t1.MindTest" +
                    "\n\t\t\t\t\t\t2.Love Calculator" +
                    "\n\t\t\t\t\t\t3.See Who You Are");
            System.out.println("\n\t\t=================================================================");
            System.out.print("\n\t\t\t\t\tChoose = ");
            num = inp.nextInt();
            if (num==1){
                mt.menu();
            }
            else if (num==2){
                lv.menu();
            }
            else if (num==3){
                wh.menu();
            }

        }
    }
    public static void main(String[] args) {
        main m = new main();
       m.menu();
    }
}
