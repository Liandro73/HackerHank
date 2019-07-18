package br.com.liandro.hhankatividades;

import java.util.Scanner;

public class Aula05 {
	
	private static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        long N = ler.nextLong();
        ler.close();
         if(N % 2 != 0) {
            System.out.println("Weird");
        }        
         else if((N > 2 & N < 5) & N % 2 == 0) {
            System.out.println("Not Weird");
        }
         else if(N > 6 & N <= 20) {
            System.out.println("Weird");
        }
         else if (N > 20 & N % 2 == 0) {
            System.out.println("Not Weird");
        }
    }
}

