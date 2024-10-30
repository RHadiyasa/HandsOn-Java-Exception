package com.enigma.gosling;

public class Main {
    public static void main(String[] args) {
        /**
         * 01
         * */
        int number = 10;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        try {
            try {
                System.out.println(number / 0);
            } catch (Exception exception) {
//                exception.printStackTrace(); // cetak letak/detail kesalahan
                System.out.println("Error divided by 0: " + exception.getMessage()); // cetak pesan error
            }
            System.out.println(numbers[7]);
        } catch (Exception exception) {
//            exception.printStackTrace(); // cetak letak/detail kesalahan
            System.out.println("Error Index Array: " + exception.getMessage());
        }

        System.out.println("Rafi Hadiyasa");

        /**
         * 02
         * */
        String name = InputUtils.inputString("Input name");
        int age = InputUtils.inputInt("Input Age");
        System.out.println(name);
        System.out.println(age);

    }
}
