package com.enigma.gosling;

public class ExampleException {
    /**
     * 05
     */
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = InputUtils.inputInt("Choose index");
        int divider = InputUtils.inputInt("Divider: ");

        try {
            float result = (float) numbers[index] / divider;
            System.out.println(numbers[index] + "/" + divider + "= " + result);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error Array: " + exception.getMessage());
        }

        try {
            int result = numbers[index] / divider;
            System.out.println(numbers[index] + "/" + divider + "= " + result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
            System.out.println("Arithmetic Error: " + exception.getMessage());
        }
    }
}
