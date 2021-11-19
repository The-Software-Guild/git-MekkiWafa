package com.mthree;

import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World !!");
        Random rng = new Random();
// generate 10 numbers, each between 0 and 9
        for (int i=0; i<= 10; i++) {
            int randomNumber = rng.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
