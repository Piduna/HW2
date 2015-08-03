package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task1 {

    //method public static, because i don`t want
    //to create new object after main
    public static String temp (int t) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input bitness (2,8,16): ");
        int m = scanner.nextInt();
        System.out.println("Your bitness is: " + m);


        int a;
        //mass for 16-bitness
        String [] mass = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        //temp variable
        String temp = "";


        if (m == 2) {
            while (t > 0) {
                a = t % m;
                temp = a + temp;
                t = t / m;
            }
        } else if (m == 8) {
            while (t > 0) {
                a = t % m;
                temp = a + temp;
                t = t / m;
            }
        } else if (m == 16) {
            while (t > 0) {
                a = t % m;
                temp = mass[a] + temp;
                t = t / m;
            }
        } else {
            System.out.println("Bitness must be: 2,8,16");
        }

        //+0 for 16-bitness
        if (m==16){
            return "0"+temp;
        } else
            return temp;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your nubmer: ");
        //"n" is it parameter for our method
        int n = scanner.nextInt();
        System.out.println("Your number is: " + n);

        System.out.println(temp(n));

    }
}
