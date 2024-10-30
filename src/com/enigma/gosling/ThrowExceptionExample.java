package com.enigma.gosling;

import com.enigma.gosling.exception.AnimalNotFoundException;
import com.enigma.gosling.exception.PeopleNotFoundException;

import java.util.List;

public class ThrowExceptionExample {
    /**
     * Kita bisa melempar kembali throw exception dari method yang dipanggil
     * dengan menyisipkan "throw" pada method.
     * <p>
     * contoh:
     * callSomeMethod() di dalamnya memanggil findPersonByName();
     * kemduian 'callSomeMethod' ketika dipanggil di main, wajib dilakukan try-catch atau bisa dilempar lagi
     */

    public static void main(String[] args) {
        try {
            callSomeMethod();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void callSomeMethod() throws Exception {
        try {
            String name = InputUtils.inputString("Input name");
            String result = findPersonByName(name);

            // Kode di bawah ini bisa jadi tidak dijalankan
            // ketika terjadi exception pada findPersonByName
            // bisa menggunakan try-catch agar tidak berhenti
            System.out.println("Found! " + result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            String animal = InputUtils.inputString("Input Animal");
            String animalResult = findAnimalByName(animal);
            System.out.println(animalResult + " Found!");
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    // Checked exception
    // Wajib menggunakan "throws" setelah parameter
    // kalo misalkan ingin menggunakan "throw" di dalam method
    // Checked exception wajin diimplementasi menggunakan try-catch block
    private static String findPersonByName(String name) throws Exception {
        List<String> names = List.of("Prabowo", "Jokowi", "Budi", "Sri Mulyani", "Bahlil");
        String findName = null;

        for (String n : names) {
            if (name.equalsIgnoreCase(n)) {
                findName = n;
            }
        }

        if (findName == null) {
            // keyword throw digunaakn untuk menghasilkan sebuah error ketika kode
            // yang tidak sesuai dengan ekpektasi developer.
            // Maka, orang lain yang mengakses methodini harus melakukan try-catch
            // sesuai dengan type-nya (checked / unchecked)

            // throw new Exception("Name not found");
            throw new PeopleNotFoundException("People not found");
        }

        return findName;
    }

    // Unchecked exception
    // Tidak wajib menggunakan "throws" setelah parameter
    // Tidak wajib menggunakan try-catch block meskipun berpotensi error
    private static String findAnimalByName(String animalName) {
        List<String> animals = List.of("Ayam", "Sapi", "Kambing", "Kucing", "Anjing");
        String findAnimal = null;

        for (String animal : animals) {
            if (animalName.equalsIgnoreCase(animal)) {
                findAnimal = animal;
            }
        }

        if (findAnimal == null) {
            // throw new RuntimeException("Animal Not Found...");
            throw new AnimalNotFoundException("Animal not found...!");
        }

        return findAnimal;
    }
}
