/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunt_6;

import java.util.Scanner;

/**
 *
 * @author f.silva
 */
public class Pergunt_6 {

    public static void main(String[] args) {
        int[] numeros;
        int soma = 0, Numero = 0;
        float media;
        Scanner in;
        
        System.out.print("Digite a quantidade de numeros que queira: ");
        in = new Scanner(System.in);
        Numero = in.nextInt();
        
        numeros = new int[Numero];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %s número: ", (i+1));
            in = new Scanner(System.in);
            soma += numeros[i] = in.nextInt();
        }
        media = (float)soma / Numero;
        System.out.printf("A Media dos números digitados é: %1.2f\nA Soma dos numeros digitados é: %d\nA Quantidade de numeros digitados foram : %d\n", media, soma, Numero);
    }
}
