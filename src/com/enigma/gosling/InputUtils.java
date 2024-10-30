package com.enigma.gosling;

import java.util.Scanner;

public class InputUtils {
    public static String inputString(String string){
        Scanner scanner = new Scanner(System.in);

        /** 03 */
        while(true){
            System.out.printf("%s: ", string);
            String input = scanner.nextLine();

            if (input.isEmpty() || input.isBlank()) continue;
            return input;
        }
    }

    public static int inputInt(String string){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("%s: ", string);
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception exception){
                // ignored
            }
        }
        /** 05
         while (true){
            System.out.printf("%s: ", string);
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception exception){
                // ignored
            }
        }
         */

        /** 04
        while(true){
            System.out.printf("%s: ", string);
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            }catch (Exception exception){
                continue;
            }
        }
         */
    }
}
