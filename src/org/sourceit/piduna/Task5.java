package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */

    //use interface, because we can use void with non-abstract argument
    //we can use abstract class too, but we must to change void to abstract
    //see
    //    abstract class iMass {
    //    int ROWS = 8;
    //    int COLUMS = 5;
    //    int TOP = 90;
    //    int BOT = 10;
    //    abstract void gen_print();
    //    }

    interface iMass {

    int ROWS = 8;
    int COLUMS = 5;
    int TOP = 90;
    int BOT = 10;

    void gen_print();
    }

    //we can use simple class from interface iMass
    //but "extends" was change on "implements"
    class Mass implements iMass{
    //our void
    public void gen_print(){
        //make mass with parameters from constants
        int [][] mass = new int [ROWS][COLUMS];
        //two cycles
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMS; j++) {
                //math.random with parameters from constants
                mass[i][j] = (int)(Math.random() * TOP) + BOT;
                //method print for "nice" matrix
                System.out.print(mass[i][j] + " ");
            }
            //" " - for transfer elements of matrix
            System.out.println();
        }
    }
    }

    public class Task5 {

        public static void main(String[] args) {

        //object
        Mass mass = new Mass();
        //call from new object our void
        mass.gen_print();

        }

    }
