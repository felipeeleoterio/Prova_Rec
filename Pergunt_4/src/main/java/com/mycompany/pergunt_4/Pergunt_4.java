/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
Utilize:
JOptionPane.showMessageDialog
JOptionPane.showInputDialog */

package com.mycompany.pergunt_4;

import javax.swing.JOptionPane;

/**
 *
 * @author f.silva
 */
public class Pergunt_4 {

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite um numero: ");
        int n = Integer.parseInt(num);
        JOptionPane.showMessageDialog(null, "O antecessor: "+(n-1));
        JOptionPane.showMessageDialog(null, "O sucessor: "+(n+1));
    }
}
