package com.mycompany.pergunt_3;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author f.silva
 */
public class Pergunt_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double Cexpre = 0.75;double Ccap= 1.00; double Ccleite = 1.25;
        double tot; int pedido; int Qtdcex = 0; int Qtdcca =0; int Qtdccleite=0;
        double valorT=0.0;
        System.out.println("1-Cafe expresso = 0.75");
        System.out.println("2-Cafe capuccino = 1.00");
        System.out.println("3-Cafe com leite = 1.25");
        System.out.println("4- total da compra");
        System.out.println("Digite a opção que deseja ?");
        pedido = ler.nextInt();
         if(pedido == 1){
           Qtdcex=Qtdcex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           Qtdcca=Qtdcca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           Qtdccleite=Qtdccleite+1;
           valorT = valorT + 1.25;
        }
        while(pedido != 4){
            if(pedido == 4){
                break;
                
            }
        System.out.println("Digite a opção que  deseja ?");
        pedido = ler.nextInt();
        if(pedido == 1){
           Qtdcex=Qtdcex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           Qtdcca=Qtdcca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           Qtdccleite=Qtdccleite+1;
           valorT = valorT + 1.25;
        }
    }
        System.out.println("O valor total a ser pago é");
        System.out.println(valorT);
        System.out.println("Quantidade de café empressos pedidos " + Qtdcex);
        System.out.println("Quantidade de café capuccino pedido  " + Qtdcca );
        System.out.println("Quantidade de café com leite pedido  " + Qtdccleite );
}

    }

