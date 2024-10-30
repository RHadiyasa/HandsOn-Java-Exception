package com.enigma.gosling.exception;


/** Custom Exception
 * Membuat custom exception harus melakukan inheritance ke beberapa class exception
 * yang disediakan di java
 *
 * contoh: Exception (Checked), RuntimeException(Unchecked)
 * */
public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(String message){
        super(message);
    }
}
