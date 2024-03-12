/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void inputSisi(Scanner input) {
        // Memasukkan tiga sisi untuk sebuah segitiga
        int a, b, c;
        do {
            System.out.println("Masukkan panjang sisi segitiga (a <= b <= c)");
            System.out.print("Panjang sisi a: ");
            a = input.nextInt();
            System.out.print("Panjang sisi b: ");
            b = input.nextInt();
            System.out.print("Panjang sisi c: ");
            c = input.nextInt();
        } while (!(a <= b && b <= c));

        jenisSegitiga(a, b, c);
    }
    
    public static void jenisSegitiga(int a, int b, int c) {
        // Menentukan jenis segitiga
        if (a * a + b * b == c * c) {
            System.out.println("Ketiga sisi tersebut membentuk Segitiga siku-siku.");
        } else if (a * a + b * b > c * c) {
            System.out.println("Ketiga sisi tersebut membentuk Segitiga lancip.");
        } else {
            System.out.println("Ketiga sisi tersebut membentuk Segitiga tumpul.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inputSisi(input);
        input.close();
    }
}