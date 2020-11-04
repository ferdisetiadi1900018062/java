package com.company;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer masukan;
        Integer masukana;
        Operasi data = new Operasi();
        Scanner scan = new Scanner(System.in);
        Scanner scana = new Scanner(System.in);

        //data menu program tugas evaluasi
        System.out.println("===============");
        System.out.println("daftar program");
        System.out.println("====================================");
        System.out.println("1. mengeluarkan data dalam array.");
        System.out.println("2. menjumlahkan data dalam array.");
        System.out.println("3. mengalihkan data dalam array.");
        System.out.println("4. mengurutkan data dalam array.");
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println("masukan pilihan   =");
        masukan = scan.nextInt();
        System.out.println(" ");
        switch (masukan){
            case 1:
                System.out.println("data ");
                System.out.println("jumlah data dalam array ="+data.getUrut());
                break;
            case 2:
                System.out.println("hasil penjumlahan data dalam array ="+data.getJumlah());
                break;
            case 3:
                System.out.println("hasil perkalian data dalam array ="+data.getKali());
                break;
            case 4:
                System.out.println("data setelah di urutkan");
                System.out.println("jumlah dalam array data ="+data.getSort());
                break;
            default:
                break;
        }
        System.out.println("mau melakukan program lagi?(1=YES/2=NO)");
        masukana = scana.nextInt();
        if(masukana==1){
            System.out.println("===============");
            System.out.println("daftar program");
            System.out.println("====================================");
            System.out.println("1. mengeluarkan data dalam array.");
            System.out.println("2. menjumlahkan data dalam array.");
            System.out.println("3. mengalihkan data dalam array.");
            System.out.println("4. mengurutkan data dalam array.");
            System.out.println("====================================");
            System.out.println(" ");
            System.out.println("masukan pilihan   =");
            masukan = scan.nextInt();
            System.out.println(" ");
            switch (masukana){
                case 1:
                    System.out.println("data ");
                    System.out.println("jumlah data dalam array ="+data.getUrut());
                    break;
                case 2:
                    System.out.println("hasil penjumlahan data dalam array ="+data.getJumlah());
                    break;
                case 3:
                    System.out.println("hasil perkalian data dalam array ="+data.getKali());
                    break;
                case 4:
                    System.out.println("data setelah di urutkan");
                    System.out.println("jumlah dalam array data ="+data.getSort());
                    break;
                default:
                    break;
            }
            System.out.println("program hanya dapat melakukan 2 kali operasi.");
            System.out.println("program selesai,terima kasih");
        }
        else {
            System.out.println("invalid data");
        }

    }
}
