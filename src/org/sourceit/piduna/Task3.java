package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task3 {

    //method public static, because i don`t want
    //to create new object after main
    public static int temp (int... s) {
        int sum=0;
        for (int i=s.length-1;i>=0;i--) {
            if (s[i] == 1)
                //our operation, sum of our numbers "2" in "i"
                sum += Math.pow(2, s.length - (i + 1));
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(temp(1,1,1,0,1,0,1,0,1,0) + temp(1,0,1,1,1,0,0,1));
        System.out.println(temp(1,0,1,1,1,0,1,0) + temp(1,0,0,1,0,1,0,0));

    }
}
