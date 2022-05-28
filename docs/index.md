
                    _ _ _ _ _           _       _ _          _ _      _ 
                   |_ _   _ _|       /     \    \  \        /  /   /    \
                      |  |          /  / \  \    \  \      /  /   /  /\  \
                      |  |         /  /_ _\  \    \  \    /  /   /  / _\  \
                      |  |        /  _ _ _ _  \    \  \  /  /   /   _ _ _  \ 
                  _ _ /  /       /  /       \  \    \  \/  /   /  /      \  \
                 |_ _ _ /       /__/         \__\    \_ _ /   /_ /        \ _\
                 
                       
# Java game for Beginners
 This Java Game created only using OOP(Object Oriented Programming concept without Java Swing and any JFrames
#CODE REVIEW

This Program is Created by Gutu and It's simple Java
Steps to Follow to Import on your IDE

Step 1: Download ZIP File from the Code tab and Unzip it Location when you want to.

Step 2: Then Open your Project by Importing on IDE you use 

Step 3: Run main.Java

**Main class**
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

             **LoveCalculator**
             
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
**    MINDTEST**

package com.game.group;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class mindTest {
    int aBal, sBal, rNum,gNum1,gNum2,gNum, deft = 100,bal,bal1,bal2,orig,bound,star;
    String usr,usr1,usr2,nm, nm1;;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    public void readFL(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("game.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }


        reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
                }
        start();

    }
    public void saveFL(){
        try {
            BufferedWriter wrt = new BufferedWriter(new FileWriter("game.txt"));
            wrt.write("\nUserName : "+usr);
            wrt.write("\nPoints Available : "+bal);
            wrt.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void statSingle(){
        System.out.println("\n\t\tMr(Mrs)."+usr);
        System.out.println("\n\t\tDefault Point = "+deft);
        System.out.println("\n\t\tYour Points = "+bal);

        single();
    }
    public void statTwo(){
        System.out.println("\n\t\tMr(Mrs)."+usr1);
        System.out.println("\n\t\tDefault Point = "+deft);
        System.out.println("\n\t\tYour Points = "+bal1);

        System.out.println("\n\t\t\t\t\t\t\t\tMr(Mrs)."+usr2);
        System.out.println("\n\t\t\t\t\t\t\t\tDefault Point = "+deft);
        System.out.println("\n\t\t\t\t\t\t\t\tYour Points = "+bal2);

        two();

    }

    public void menu() {
        int men;

            int i=1;
            System.out.print("\n\n\t\t\t\tPlease wait");
            while (i<=3) {
                i++;
                System.out.print(".");
                try {
            Thread. sleep(2000) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            }

        System.out.println("\n\n\n\n\n\n\t\t\t\t\t\tGUESSING GAME");
        System.out.print("\t\t\tDo You Want to join this game ? (y/n): ");
        nm = input.next();
        nm1 = nm.toLowerCase();
        if (nm1.equals("y")) {
            System.out.println("\n\t\tI AM HAPPY TO SEE YOU AGAIN :)\n");
            System.out.println("\t\t\t=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("\t\t\t\t1.Start");
            System.out.println("\t\t\t\t2.About");
            System.out.println("\t\t\t\t3.Exit");
            System.out.println("\t\t\t=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("\t\t\tplease choose from (1 - 3): ");
            men = input.nextInt();

            switch (men) {
                case 1:
                    start();
                    break;
                case 2:
                    about();
                    break;
                case 3:
                    readFL();
                    break;
            }
        } else {
            System.out.println("THANKS FOR VISITING US");
        }

    }

    public void start() {

        System.out.println("\t\t\t\t1.Single Play");
        System.out.println("\t\t\t\t2.Two-Players");
        System.out.println("\t\t\t\t3.Exit");
        System.out.print("Choose How You Are Going To Play= ");
        star = input.nextInt();
        if (star == 1) {
            single();
        } else if (star == 2) {
            two();
        } else if (star==3){
            exit();
        }
        else {
            exit();
        }
    }
    public void single() {
        System.out.println("You have choose Single playing options");
        int opt;

        System.out.println("\t\tHow you are going to play");
        System.out.println("\t\t\t\t1.Default");
        System.out.println("\t\t\t\t2.Use Input");
        System.out.println("\t\t\t\t3.Status");
        System.out.println("\t\t\t\t4.Exit");
        System.out.print("choose = ");
        opt = input.nextInt();
        System.out.print("username: ");
        usr = input.next();
        if (opt == 1) {
            def();
        } else if (opt == 2) {
            userInt();
        } else if (opt == 3){
            //statSingle();
            readFL();
        }
        else if (opt == 4){
            exit();
        }
        else {
            exit();
        }

    }
    public void def() {
        sBal = deft - 10;
        aBal = deft + 20;

        System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
        System.out.println("\n\t\t Please Guess Number between 1 and 5");
        System.out.print("\n\t Enter = ");
        gNum = input.nextInt();
        rNum = random.nextInt(1, 5);

        while (!(gNum>=1&&gNum<=5)) {
            System.out.println("You are out of boundary please choose number between 1 and 5");
            System.out.println("\n\t\t Please Guess Number Again between 1 and 5");
            System.out.print("\n\t Enter = ");
            gNum = input.nextInt();
            rNum = random.nextInt(1, 5);
        }

        System.out.println("\t\tYou have Entered : " + gNum + "  " + "\t\t\t\t\t\tthe number is : " + rNum);

        if (gNum == rNum) {
            System.out.println("\t\tCongrats you get it " + " \n\t\t\t\t\treceived : 20 pts ");

            bal = aBal;
            System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
        }
        else {
            System.out.println("Sorry (: " + "\n\t\t\t\t\tloose : 10 pts ");
            bal = sBal;
            System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
        }
        while (!(bal>=140||bal<10)&&(gNum>=1 &&gNum<=5)){
            System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
            System.out.println("\n\t\t Please Guess Number Again between 1 and 5");
            System.out.print("\n\t Enter = ");
            gNum = input.nextInt();
            rNum = random.nextInt(1, 5);

            while (!(gNum >= 1 && gNum <= 5) ) {
                System.out.println("You are out of boundary please choose number between 1 and 5");
                System.out.println("\n\t\t Please Guess Number Again between 1 and 5");
                System.out.print("\n\t Enter = ");
                gNum = input.nextInt();
                rNum = random.nextInt(1,5);
            }

            System.out.println("\t\tYou have Entered : " + gNum + "  " + "\t\t\t\t\t\tthe number is : " + rNum);

                    if (gNum == rNum) {
                        System.out.println("\t\tCongrats you get it " + " \n\t\t\t\t\treceived : 20 pts ");

                        bal = bal + 20;
                        System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
                        check();
                    } else if (!(gNum == rNum)) {
                        System.out.println("Sorry (: " + "\n\t\t\t\t\tloose : 10 pts ");
                        bal = bal - 10;
                        System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
                        check();
                    }
                }
            }
    public void userInt(){
        sBal = deft - 10;
        aBal = deft + 20;

        System.out.println("You Have choose userInt mode so please Enter the origin and bound numbers");
        System.out.print("Enter Origin = ");
        orig = input.nextInt();
        System.out.print("Enter Bound = ");
        bound = input.nextInt();
        System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
        System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
        System.out.print("\n\t Enter = ");
        gNum = input.nextInt();
        rNum = random.nextInt(orig,bound);
        while (!(gNum>=orig&&gNum<=bound)){
            System.out.println("You are out of boundary please choose number between "+orig+" and "+bound);
            System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
            System.out.print("\n\t Enter = ");
            gNum = input.nextInt();
            rNum = random.nextInt(orig,bound);
        }
        System.out.println("\t\tYou have Entered : " + gNum + "  " + "\t\t\t\t\t\tthe number is : " + rNum);

        if (gNum == rNum) {
            System.out.println("\t\tCongrats you get it " + " \n\t\t\t\t\treceived : 20 pts ");

            bal = aBal;
            System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
        }
        else {
            System.out.println("Sorry (: " + "\n\t\t\t\t\tloose : 10 pts ");
            bal = sBal;
            System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
        }
        while (!(bal>=140||bal<10)){
            System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
            System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
            System.out.print("\n\t Enter = ");
            gNum = input.nextInt();
            rNum = random.nextInt(orig, bound);
            while (!(gNum>=orig&&gNum<=bound)){
                System.out.println("You are out of boundary please choose number between "+orig+" and "+bound);
                System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
                System.out.print("\n\t Enter = ");
                gNum = input.nextInt();

                rNum = random.nextInt(orig, bound);
            }
            System.out.println("\t\tYou have Entered : " + gNum + "  " + "\t\t\t\t\t\tthe number is : " + rNum);

            if (gNum == rNum) {
                System.out.println("\t\tCongrats you get it " + " \n\t\t\t\t\treceived : 20 pts ");

                bal = bal+20;
                System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
            }
            else if (!(gNum==rNum)){
                System.out.println("Sorry (: " + "\n\t\t\t\t\tloose : 10 pts ");
                bal = bal - 10;
                System.out.println("\t\t\tCurrent Balance is : " + bal + " pts");
            }
        }
        check();
    }
    public void two(){
        System.out.println("You have choose Two-playing modes");
        int opt;
        System.out.print("\n\t\t\tPlayer 1(username): ");
        usr1 = input.next();
        System.out.print("\n\t\t\tPlayer 2(username): ");
        usr2 = input.next();
        System.out.println("\t\tWelcome Again "+"\n\t"+usr1+" = "+deft+" pts" +"\t\t\t\t\t\t\t"+usr2+" = "+ deft +" pts");
        System.out.println("\t\tHow You are Going to play");
        System.out.println("\t\t\t\t1.Default");
        System.out.println("\t\t\t\t2.Use Input");
        System.out.println("\t\t\t\t3.Status");
        System.out.println("\t\t\t\t4.Exit");
        System.out.print("\tchoose = ");
        opt = input.nextInt();
        if (opt==1){
            defTwo();
        }
        else if (opt==2){
            userTwo();
        }
        else if (opt==3){
            statTwo();
        }
        else if (opt ==4){
            exit();
        }
        else {
            exit();
        }
    }
    public void defTwo(){

        sBal = deft - 10;
        aBal = deft + 20;
        System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
        System.out.println("\n\t\t Please Guess Number between 1 and 5");
        System.out.print("\n\t Enter "+usr1+" = ");
        gNum1 = input.nextInt();
        System.out.print("\n\t Enter "+usr2+" = ");
        gNum2 = input.nextInt();
        rNum = random.nextInt(1, 5);
        while (!(gNum1>=1&&gNum1<=5)){
            System.out.println("You are out of boundary please choose number between 1 and 5");
            System.out.println("\n\t\t Please Guess Number Again between 1 and 5 "+usr1);
            System.out.print("\n\t Enter "+usr1+" = ");
            gNum1 = input.nextInt();
            rNum = random.nextInt(1, 5);
        }
        while (!(gNum2>=1&&gNum2<=5)){
            System.out.println("You are out of boundary please choose number between 1 and 5");
            System.out.println("\n\t\t Please Guess Number Again between 1 and 5 "+usr1);
            System.out.println("Or Just Enter 0 to Exit");
            System.out.print("\n\t Enter "+usr2+" = ");
            gNum2 = input.nextInt();
            rNum = random.nextInt(1, 5);
        }
        System.out.println("\t\tYou have Entered "+usr1+" = " + gNum1 + "\t\t\t\t\t\tYou have Entered "+usr2+" = " + gNum2);
        System.out.println("\t\t\t\tthe number is = " + rNum);

        if (gNum1 == rNum) {
            System.out.println("\t\tCongrats you get it "+ usr1 + " \n\t\t\t\t\treceived : 20 pts ");

            bal1 = aBal;
            System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
        }
        if(gNum2 == rNum){
            System.out.println("\t\tCongrats you get it "+usr2+ " \n\t\t\t\t\treceived : 20 pts ");

            bal2 = aBal;
            System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
        }
        if (!(gNum1 == rNum)){
            System.out.println("Sorry (: " +usr1+ "\n\t\t\t\t\tloose : 10 pts ");
            bal1 = sBal;
            System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1+ " pts");
        }
        if (!(gNum2 == rNum)){
            System.out.println("Sorry (: " +usr2+ "\n\t\t\t\t\tloose : 10 pts ");
            bal2 = sBal;
            System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2+ " pts");
        }
        while (!(bal1>=140||bal2>=140||bal2<10||bal1<10)){
            System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
            System.out.println("\n\t\t Please Guess Number between 1 and 5");
            System.out.print("\n\t Enter "+usr1+" = ");
            gNum1 = input.nextInt();
            System.out.print("\n\t Enter "+usr2+" = ");
            gNum2 = input.nextInt();
            rNum = random.nextInt(1, 5);
            while (!(gNum1>=1&&gNum1<=5)){
                System.out.println("You are out of boundary please choose number between 1 and 5");
                System.out.println("\n\t\t Please Guess Number Again between 1 and 5 "+usr1);
                System.out.print("\n\t Enter "+usr1+" = ");
                gNum1 = input.nextInt();
                rNum = random.nextInt(1, 5);
            }
            while (!(gNum2>=1&&gNum2<=5)){
                System.out.println("You are out of boundary please choose number between 1 and 5");
                System.out.println("\n\t\t Please Guess Number Again between 1 and 5 "+usr1);
                System.out.print("\n\t Enter "+usr2+" = ");
                gNum2 = input.nextInt();
                rNum = random.nextInt(1, 5);
            }
            System.out.println("\t\tYou have Entered "+usr1+" = " + gNum1 + "\t\t\t\t\t\tYou have Entered "+usr2+" = " + gNum2);
            System.out.println("\t\t\t\t\tThe Correct number is = " + rNum);
            if (gNum1 == rNum) {
                System.out.println("\t\tCongrats you get it "+ usr1 + " \n\t\t\t\t\treceived : 20 pts ");

                bal1 = bal1+20;
                System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
            }
             if(gNum2 == rNum){
                System.out.println("\t\tCongrats you get it "+usr2+ " \n\t\t\t\t\treceived : 20 pts ");

                bal2 = bal2+20;
                System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
            }
            if (!(gNum1 == rNum)){
                System.out.println("Sorry (: " +usr1+ "\n\t\t\t\t\tloose : 10 pts ");
                bal1 = bal1-10;
                System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
            }
            if (!(gNum2 == rNum)){
                System.out.println("Sorry (: " +usr2+ "\n\t\t\t\t\tloose : 10 pts ");
                bal2 = bal2-10;
                System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
            }
        }
        checkTwo();
    }
    public void userTwo(){

        sBal = deft - 10;
        aBal = deft + 20;
        System.out.println("You Have choose userInt mode so please Enter the origin and bound numbers");
        System.out.print("Enter Origin = ");
        orig = input.nextInt();
        System.out.print("Enter Bound = ");
        bound = input.nextInt();
        while (orig>=bound){
            System.out.println("Origin Value can't be equal to and greater than Boundary Value");
            System.out.println("You Have choose userInt mode so please Enter the origin and bound numbers");
            System.out.print("Enter Origin = ");
            orig = input.nextInt();
            System.out.print("Enter Bound = ");
            bound = input.nextInt();
        }
        System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
        System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
        System.out.print("\n\t Enter "+usr1+" = ");
        gNum1 = input.nextInt();
        System.out.print("\n\t Enter "+usr2+" = ");
        gNum2 = input.nextInt();
        rNum = random.nextInt(orig, bound);
        while (!(gNum1>=orig&&gNum1<=bound)){
            System.out.println("You are out of boundary please choose number between 1 and 5");
            System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound+" "+usr1);
            System.out.print("\n\t Enter "+usr1+" = ");
            gNum1 = input.nextInt();
            rNum = random.nextInt(orig, bound);
        }
        while (!(gNum2>=orig&&gNum2<=bound)){
            System.out.println("You are out of boundary please choose number between 1 and 5");
            System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound+" "+usr1);
            System.out.print("\n\t Enter "+usr2+" = ");
            gNum2 = input.nextInt();
            rNum = random.nextInt(orig, bound);
        }
        System.out.println("\t\tYou have Entered "+usr1+" = " + gNum1 + "\t\t\t\t\t\tYou have Entered "+usr2+" = " + gNum2);
        System.out.println("\t\t\t\t\tThe Correct number is = " + rNum);

        if (gNum1 == rNum) {
            System.out.println("\t\tCongrats you get it "+ usr1 + " \n\t\t\t\t\treceived : 20 pts ");

            bal1 = aBal;
            System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
        }
        if(gNum2 == rNum){
            System.out.println("\t\tCongrats you get it "+usr2+ " \n\t\t\t\t\treceived : 20 pts ");

            bal2 = aBal;
            System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
        }
        if (!(gNum1 == rNum)){
            System.out.println("Sorry (: " +usr1+ "\n\t\t\t\t\tloose : 10 pts ");
            bal1 = sBal;
            System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1+ " pts");
        }
        if (!(gNum2 == rNum)){
            System.out.println("Sorry (: " +usr2+ "\n\t\t\t\t\tloose : 10 pts ");
            bal2 = sBal;
            System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2+ " pts");
        }
        while (!(bal1>=140||bal2>=140||bal2<10||bal1<10)){
            System.out.println("Have a nice chance if you get the number you get 20 pts otherwise you loose 10 pts");
            System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound);
            System.out.print("\n\t Enter "+usr1+" = ");
            gNum1 = input.nextInt();
            System.out.print("\n\t Enter "+usr2+" = ");
            gNum2 = input.nextInt();
            rNum = random.nextInt(orig, bound);
            while (!(gNum1>=orig&&gNum1<=bound)){
                System.out.println("You are out of boundary please choose number between 1 and 5");
                System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound+" "+usr1);
                System.out.print("\n\t Enter "+usr1+" = ");
                gNum1 = input.nextInt();
                rNum = random.nextInt(orig, bound);
            }
            while (!(gNum2>=orig&&gNum2<=bound)){
                System.out.println("You are out of boundary please choose number between 1 and 5");
                System.out.println("\n\t\t Please Guess Number between "+orig+" and "+bound+" "+usr2);
                System.out.print("\n\t Enter "+usr2+" = ");
                gNum2 = input.nextInt();
                rNum = random.nextInt(orig, bound);
            }
            System.out.println("\t\tYou have Entered "+usr1+" = " + gNum1 + "\t\t\t\t\t\tYou have Entered "+usr2+" = " + gNum2);
            System.out.println("\t\t\t\t\tThe Correct number is = " + rNum);


            if (gNum1 == rNum) {
                System.out.println("\t\tCongrats you get it "+ usr1 + " \n\t\t\t\t\treceived : 20 pts ");

                bal1 = bal1+20;
                System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
            }
            if(gNum2 == rNum){
                System.out.println("\t\tCongrats you get it "+usr2+ " \n\t\t\t\t\treceived : 20 pts ");

                bal2 = bal2+20;
                System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
            }
            if (!(gNum1 == rNum)){
                System.out.println("Sorry (: " +usr1+ "\n\t\t\t\t\tloose : 10 pts ");
                bal1 = bal1-10;
                System.out.println("\t\t\tCurrent Balance is "+usr1+" = "+ bal1 + " pts");
            }
            if (!(gNum2 == rNum)){
                System.out.println("Sorry (: " +usr2+ "\n\t\t\t\t\tloose : 10 pts ");
                bal2 = bal2-10;
                System.out.println("\t\t\tCurrent Balance is "+usr2+" = "+ bal2 + " pts");
            }
        }
        checkTwo();
    }
    public void checkTwo(){
        if (bal1< 10)
        {
            System.out.println("You Loose The Game "+usr1+" try Again");
            System.out.println("You Have Won "+usr2);
            exit();
        }
        if (bal2< 10)
        {
            System.out.println("You Loose The Game "+usr2+" try Again");
            System.out.println("You Have Won "+usr1);
            exit();
        }

        if (bal1 >=140)
        {
            System.out.println("Congratulation " + usr1 + " You Won the Game :) -- (:");
            System.out.println("You Loose "+ usr2);
            exit();
        }
        if (bal2 >=140)
        {
            System.out.println("Congratulation " + usr2 + " You Won the Game :) -- (:");
            System.out.println("You Loose "+ usr1);
            exit();
        }
        else if (bal1<10&&bal2<10){
            System.out.println("Both Looses Congratulation Unique");
            exit();
        }
        else {
            System.out.println("Both Wins Congratulation Unique");
            exit();
        }
    statTwo();
    }
    public void check(){
        if (bal< 10)
        {
            System.out.println("You Loose The Game try Again");
            exit();
        }
        else if (bal >=140)
        {
            System.out.println("Congratulation " + usr + " You Won the Game :) -- (:");
            exit();
        }
    }
    public void about(){
        System.out.println("\t\t\t\n\nWEL_COME TO GUESSING GAME");
        System.out.println("=> This is game is created by Group 1");
        System.out.println("=> To play this game you have to choose 1.Start");
        System.out.println("=> Then Choose how you are going to play ");
        System.out.println("\t\t\t1.Single");
        System.out.println("\t\t\t2.Two-Player");
        System.out.println("=> This is means it have two options single and two playing options");
        System.out.println("Here it is is how it works");
        System.out.println("=> when you start the game you will receive 100 points");
        System.out.println("=> If you play single or two player when you guess one number"+"\n\t- If u get the " +
                "number you will receive another 20 points " +
                "\n\t- But if you loose it will reduce the point by 10" +
                "\n\t- Finally to Win or loose" +
                "\n\t\t1.Single player => If your point reaches 150 points you will WIN" +
                "\n\t\t2.Two-Player => If one of the players reaches 150 points before the guessing round is finished " +
                "\n\t\t\t- This means when u plays Two-playing mode you have 10 rounds to guess both gets 5 round ");
        System.out.println("\n\tTHANKS FOR READING !");
        exit();
    }
    public void exit(){
        System.out.println("Do you want to continue(y/n)");
        System.out.print("Enter = ");
        nm = input.next();
        nm1 = nm.toLowerCase();

        if (nm1.equals("y")){
            start();
        }
        else {
            saveFL();
            System.out.println("THANKS FOR VISITING US");
        }

    }

}
      ** WHOAMI **

package com.game.group;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class whoAmI {
    main mn = new main();
    String name;
    Scanner input = new Scanner(System.in);
    public void menu(){
        int cho,age;

        System.out.println("\n\n\t\t==============================================");
        System.out.println("\n\n\t\t\tAnswer Those Questions and I will Tell You who? You are !");
        System.out.println("\n\t\t==============================================");
        System.out.print("\n\t\t\t\t\t1.Enter Your Name = ");
        name = input.next();
        System.out.println("\t\t==============================================");
        System.out.print("\t\t\t\t\t2.Enter Your Age = ");
        age = input.nextInt();
        System.out.println("\n\t\t==============================================");
        System.out.println("\n\n\t\t\tChoose Your Favorite color");
        System.out.println("\t\t==============================================");
        System.out.print("" +
                "\t\t\t\t\t\t1.Purple\n" +
                "\t\t\t\t\t\t2.Black\n" +
                "\t\t\t\t\t\t3.White\n" +
                "\t\t\t\t\t\t4.Gray\n" +
                "\t\t\t\t\t\t5.Red\n" +
                "\t\t\t\t\t\t6.Pink\n" +
                "\t\t\t\t\t\t7.Orange\n" +
                "\t\t\t\t\t\t8.Blue\n" +
                "\t\t\t\t\t\t9.Green\n" +
                "\t\t\t\t\t\t10.Brown\n" +
                "\t\t\t\t\t\t11.Yellow");
        System.out.println("\n\t\t==============================================");
        System.out.print("\n\t\tChoose = ");
        cho = input.nextInt();
     switch (cho){
         case 1:
             purple();
             break;

             case 2:
             black();
             break;
         case 3:
             white();
             break;
         case 4:
             gray();
             break;
         case 5:
             red();
             break;
         case 6:
             pink();
             break;
         case 7:
             orange();
             break;
         case 8:
             blue();
             break;
         case 9:
             green();
             break;
         case 10:
             brown();
             break;
         case 11:
             yellow();
             break;
         default :

             menu();
     }
    }
    public void purple(){
        System.out.println("Hey "+name +"\n" );
        try {
            BufferedReader reader = new BufferedReader(new FileReader("purple.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void black(){

        System.out.println("Hey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("black.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void white(){
        System.out.println("Hey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("white.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void gray(){
        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("gray.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void red(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("red.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void pink(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("pink.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } mn.menu();
    }
    public void orange(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("orange.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        mn.menu();
    }
    public void blue(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("blue.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        mn.menu();
    }
    public void green(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("green.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        mn.menu();
    }
    public void brown(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("brown.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        mn.menu();
    }
    public void yellow(){

        System.out.println("\t\t\t\t\tHey "+name +"");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("yellow.txt"));
            String read ;
            while ((read = reader.readLine())!=null){
                System.out.println(read);

            }
            reader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        mn.menu();
    }

}
