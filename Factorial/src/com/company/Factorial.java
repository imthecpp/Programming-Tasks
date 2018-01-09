/*
Fractorial calculation
 */

package com.company;

public class Factorial {

    public static void main(String[] args) {


        int n = 6;
        int factorial;
        if(n == 1){
            System.out.print("1! = "+ n);
        }else {
            factorial = 1;
            for (int i = 2; i <= n; i++){
                factorial *=  i;
                System.out.println(i+"! = "+factorial);
            }
        }
    }
}
