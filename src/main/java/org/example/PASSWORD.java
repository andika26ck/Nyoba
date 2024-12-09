package org.example;

import java.util.Scanner;

class InvalidPassword extends Exception {
    public InvalidPassword(String message) {

        super(message);
    }
}

public class PASSWORD {
    public static void masukkanPass(String password) throws InvalidPassword {
        if (password.length() < 8) {
            throw new InvalidPassword("Password harus terdiri minimal 8 karakter");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPassword("Password harus memiliki setidaknya satu karakter huruf besar");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPassword("Password harus memiliki setidaknya satu karakter huruf kecil");
        }
        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPassword("Password harus memiliki setidaknya satu karakter angka");
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            throw new InvalidPassword("Password harus memiliki setidaknya satu karakter khusus");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Password Anda: ");
        String password = scanner.nextLine();

        try {
            masukkanPass(password);
            System.out.println("Password Berhasil");
        } catch (InvalidPassword e) {
            System.out.println("Password Gagal: " + e.getMessage());
        }
    }
}
