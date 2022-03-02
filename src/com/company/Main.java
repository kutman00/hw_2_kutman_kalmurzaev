package com.company;

public class Main {
    public static String option = "Можно идти гулять ";
    public static String option1 = "Oставайтесь дома ";

    public static void main(String[] args) {


        System.out.println(conket(45, 25));
        System.out.println(conket(20, -10));
        System.out.println(conket(35, 20));
        System.out.println(conket(10, 15));
        System.out.println(conket(65, 6));

    }


    public static String conket(int age, int temperature) {
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
}
