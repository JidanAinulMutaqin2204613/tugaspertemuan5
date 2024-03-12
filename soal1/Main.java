/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    // Memeriksa apakah inputan lebih dari sama dengan 1 
    public static boolean validasiN(int n) {
        return n >= 1;
    }

    // Menampilkan bilangan dari 1 hingga n
    public static void showBilangan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        // Validasi inputan n
        if (!validasiN(n)) {
            System.out.println("Nilai yang anda masukkan tidak valid.");
            input.close();
            return;
        }

        // Menampilkan bilangan dari 1 hingga n
        showBilangan(n);

        input.close();
    }
}