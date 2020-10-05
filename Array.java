/*
  
    Programmed by: Ramim Hossain
    Contact: https://ramimhossain.com/
*/




package Ramim_Apps_Ltd.company.ff;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.println("Please Enter 5 number :");


        for (int i = 0;i<5;i++){
            num[i] = in.nextDouble();
        }

        for (int j =0;j<5;j++){
            sum = sum +num[j];
        }


        System.out.println("The sum is : " + sum);

        double avg = sum/num.length;
        System.out.println("Average is : " + avg);


    }
}


