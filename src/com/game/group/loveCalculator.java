package com.game.group;

import java.util.Random;
import java.util.Scanner;

public class loveCalculator {
    int men;
    String mName,lName;
    String cont;
    float randM;

    Random rand = new Random();
    Scanner inp = new Scanner(System.in);
    public void menu(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLOVE CALCULATOR");
        System.out.println("\t\t\t\t\t\t\t\t\t\t❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t--------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tchoose your Gender");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Male");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Female");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t--------------------------------------");
        System.out.print("\t\t\t\t\t\t= ");
        men = inp.nextInt();
        switch (men){
            case 1 :
                male();
                break;
            case 2 :
                female();
                break;
            default:
                menu();
        }
    }
    public void male(){
        float upperB=100,lowerB=67;
        System.out.print("\t\t\t\t\t\t\t\t\t\tEnter Your Name \uD83E\uDD35\uD83C\uDFFE\u200D : ");
        mName = inp.next();
        System.out.print("\t\t\t\t\t\t\t\t\t\tEnter Your Girlfriends Name : ");
        lName = inp.next();
        randM = rand.nextFloat(lowerB,upperB);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMr."+mName + " Your Lover "+"Miss."+lName+ " ❤ ❤ ❤ "+randM+" %");
        lp();
    }
    public void lp(){
        System.out.print("Do you want to continue (y/n)= ");

        cont=inp.next();

        String cont1 = cont.toLowerCase();

        if(cont1.equals("y")){
            menu();
        }
        else if(cont1.equals("n")){
            System.out.println("THANKS FOR PLAYING IT IS ALL ABOUT THE GAME NOT REAL");
        }
        else {
            menu();
        }
    }
    public void female(){
        float upperB=100,lowerB=50;
        System.out.print("Enter Your Name \uD83E\uDD35\uD83C\uDFFE\u200D : ");
        lName = inp.next();
        System.out.print("Enter Your Boyfriends Name : ");
        mName = inp.next();
        randM = rand.nextFloat(lowerB,upperB);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMiss."+lName+ " Your Lover "+"Mrs."+mName+ " ❤ ❤ ❤ "+randM+" %");
        lp();
    }
}
