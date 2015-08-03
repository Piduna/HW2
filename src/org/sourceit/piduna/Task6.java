package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
    //use interface, because we can use void with non-abstract argument
    //we can use abstract class too, but we must to change void to abstract
    //see
    //    abstract class iMass {
    //    int ROWS = 7;
    //    int COLUMS = 4;
    //    int TOP = 10;
    //    int BOT = 5;
    //    abstract void gen_print();
    interface iMasss{

        int ROWS = 7;
        int COLUMS = 4;
        int TOP = 10;
        int BOT = 5;

        void gen_print();
        void module();
    }


    //we can use simple class from interface iMass
    //but "extends" was change on "implements"
    class Masss implements iMasss{

        //our two mass. why out from void ?
        //because we put that arrays into the
        //void gen_print & module
        public int mass[][];
        public int mass2[];

        //our void gen_print
        public void gen_print(){

            //make mass with parameters from constants
            mass = new int [ROWS][COLUMS];
            //for keep product elements of matrix
            mass2 = new int[mass.length];
            //two cycles
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMS; j++) {
                    //math.random with parameters from constants
                    mass[i][j] = (int)(Math.random() * TOP+1) - BOT;
                    //method format for "nice" 4d-matrix
                    System.out.format("%4d", mass[i][j]);
                    //Second array. Product of all element
                    if(j==0)mass2[i]=mass[i][j];
                    else mass2[i]*=mass[i][j];
                    //String for new paragraph
                    if(j==mass[i].length-1)
                        System.out.println(" ");
                }
            }
        }

        //our void module
        public void module(){

            int max=0,imax=0;
            //Max product by module. Index "=" i
            for(int i = 0;i < mass2.length; i++){
                if(Math.abs(mass2[i])>max){
                    max=mass2[i];
                    imax=i;
                }
            }

            System.out.println("");
            //print max & imax
            System.out.println("String with max product by module – " + max + ", index - " + imax);
        }

    }

    public class Task6 {

        public static void main(String[] args) {

            //object
            Masss masss = new Masss();
            //call from new object our void
            masss.gen_print();
            masss.module();


        }
    }
