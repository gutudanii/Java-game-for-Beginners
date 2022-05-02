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
        System.out.println("=> This is game is created by GUTU");
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
