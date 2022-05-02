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
