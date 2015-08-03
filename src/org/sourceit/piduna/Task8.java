package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task8 {

    //number from place to n
    int simple(int n)
    {
        //if n <=1 return 0
        if(n <= 1)
            return 0;
        //make cycle. from 2 to n/2
        //if n % 2 = 0, return 0
        for(int i = 2; i <= n/2; i++)
            if(n % i == 0)
                return 0;
        //int other situation, we have true (1)
        return 1;
    }

    public static void main(String[] args) {


        //scanner for input user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n: ");
        //"t" is it parameter for our sum
        int t = scanner.nextInt();
        System.out.println("n: " + t);

        //t must be more than "0"
        if (t == 0){
            System.out.println("t = 0. t must be more than 0");
        } else if (t < 0) {
            System.out.println("t is less than 0. t must be more than 0");
        } else {
            System.out.println("Ok. Lets go.");
        }

        //create new object
        Task8 simp = new Task8();

        //cycle for simple numbers from 2 to "y". y=t. "t" enter from console by user
        for(int j = 2; j <= t; j++)
            if(simp.simple(j) != 0) {
                System.out.println(j);
            }

    }
    }
