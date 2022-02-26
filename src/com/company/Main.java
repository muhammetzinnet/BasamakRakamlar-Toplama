package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();
        int basamakSayisi=0, geciciSayi=girilenSayi,basamakDegeri, toplam=0;



        while (geciciSayi!=0){
           geciciSayi /= 10;
           basamakSayisi++;
        }

        geciciSayi = girilenSayi;

        while (geciciSayi!=0){
            basamakDegeri = geciciSayi%10;
            toplam+=basamakDegeri;
            geciciSayi /= 10;
        }
        System.out.println("Girilen sayının asamaklarının toplamı = "+toplam);

    }
}
