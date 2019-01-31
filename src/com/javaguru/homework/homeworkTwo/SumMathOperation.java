package com.javaguru.homework.homeworkTwo;

import java.util.Random;

//Sum 3 different Random numbers and print them to console
//Author Veceslavs. V 2019-01-31

public class SumMathOperation {

    public static void main(String[] args){
        Random randomGenerator = new Random();
        int firstRandomNumber = randomGenerator.nextInt(45);
        int secondRandomNumber = randomGenerator.nextInt(55);
        int thirdRandomNumber = randomGenerator.nextInt(65);
        int sumResult = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

        //Option output one
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);
        System.out.println(sumResult);
        //Option output two
        System.out.print(firstRandomNumber+" + "+secondRandomNumber+" + "+thirdRandomNumber+" = "+sumResult);

    }
}