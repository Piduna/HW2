package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task7 {

    //number from place to n
    int sum (int n) {
        //if new input number 1, then "+" it with  1, and not with 0,
        // because 1 "+" 0 is infinitive loop.
        if(n==1)return 1;
            //if n>1, then "+" it number with previous state "=" sum from all element to n
            //if we write (n-1)*n, that is factorial
        else return sum(n-1)+n;
    }

    public static void main(String[] args) {

        //scanner for input user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n: ");
        //"t" is it parameter for our sum
        int t = scanner.nextInt();
        System.out.println("n: " + t);

        //create new object
        Task7 summ = new Task7();
        //call our method sum, from new object summ
        System.out.println("Summ from 1 to " + t + ": " + summ.sum(t));

    }
}
