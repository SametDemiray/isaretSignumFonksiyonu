package org.example;
/*
işaret ( signum ) fonksiyonu. Tanıma göre java da klavyeden girilen x değeri için f(x) = x²-5x+3 fonksiyonunun
işaretini hesaplayan program.
Örnek;
5 değeri için f(x) = x² - 5x + 3 fonksiyonunun değerini hesaplayalım:
f(5) = (5)² - 5(5) + 3
= 25 - 25 + 3
= 3
Bu durumda, f(5) = 3 olacaktır. Bu değer pozitif olduğundan, işaret fonksiyonu 1 değerini döndürecektir.
Yani, işaret fonksiyonu, 5 değeri için 1 değerini döndürecektir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        double result;
        int signum ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x değerini girin: ");
        x = scanner.nextDouble();

        // İşaret fonksiyonunu hesapla ve ekrana yazdır
        signum = calculateSignum(x);
        System.out.println("f(x) işareti: " + signum);

        scanner.close();
    }

    // İşaret fonksiyonunu hesapla
    public static int calculateSignum(double x) {

        double result;

        result = x * x - 5 * x + 3;

        if (result > 0) {
            return 1;  // Pozitif işaret
        } else if (result < 0) {
            return -1; // Negatif işaret
        } else {
            return 0;  // Sıfır işaret
        }
    }
}