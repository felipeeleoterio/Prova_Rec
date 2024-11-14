/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. 
Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
package com.mycompany.pergunt_2;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */
public class Pergunt_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade em anos :");
        int ano = scanner.nextInt();
        
        System.out.println("Digite quantos meses você tem desde do ultimo aniversario: ");
        int mes = scanner.nextInt();
    
        System.out.println("Digite sua idade em dias desde do ultimo aniversário: ");
        int dia = scanner.nextInt();
        
        int dias = (ano*365)+(mes*30)+ dia;
        
        System.out.println("Sua idade em dias é " +dias+" dias");
    }
}
