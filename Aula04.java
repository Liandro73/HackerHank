package br.com.liandro.hhankatividades;

import java.util.*;


public class Aula04 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = ler.nextInt();
        double d = ler.nextDouble();
        ler.nextLine();
        String texto = ler.nextLine();
        ler.close();
        
        
        System.out.println("String: " + texto);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
