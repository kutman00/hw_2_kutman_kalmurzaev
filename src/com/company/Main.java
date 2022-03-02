package com.company;

import java.util.Random;

public class Main {
    public static String option = "Можно идти гулять ";
    public static String option1 = "Oставайтесь дома ";

    public static void main(String[] args) {


        System.out.println(concat(45, 25));
        System.out.println(concat(20, -10));
        System.out.println(concat(35, 20));
        System.out.println(concat(10, 15));
        System.out.println(concat(65, 6));
        System.out.println(concat(generateRandomAge(),45));
    }


    public static String concat(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return option;
        } else if (temperature < 28 && temperature > 0 && age < 20) {

            return option;

        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return option;
        } else {
            return option1;

        }

    }
    public static int generateRandomAge (){
        Random random = new Random();
        int meth = random.nextInt(65);
        return meth;

    }
}
