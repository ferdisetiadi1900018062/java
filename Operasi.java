package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Operasi {
   private Integer angka[]={2,3,4,5,6,5};
   private Integer total=0;
   private  Integer urut;

   public Operasi(){}
   public Operasi(Integer angka[]){
       this.angka=angka;

   }

    public Integer[] getAngka() {
        return angka;
    }
    public Integer getJumlah(){
       for (Integer i=0; i<6;i++){
          total += angka[i];
       }
       return total ;
    }
    public Integer getKali(){
        for (Integer i=0; i<6;i++){
            total *= angka[i];
        }
        return total ;
    }
    public Integer getSort(){
        Arrays.sort(angka);
        for(Integer i: angka){
            System.out.println(i);
        }
        return angka.length;
    }
    public  Integer getUrut(){
        for (Integer j: angka){

                System.out.println(j);
        }
        return angka.length;
    }

    }


