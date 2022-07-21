package org.example.src;

public class Pessoa{

    public static boolean emailValid(String email) {
        return email.contains("@") && (email.length() < 51);
    }

}
