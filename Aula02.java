package hhank.atividades.aula02;

import java.util.Scanner;


public class Aula02 {

private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N % 2 != 0) {
        	System.out.println("Weird");
        } else {
        	System.out.println("Not Weird");
        }
    }
}