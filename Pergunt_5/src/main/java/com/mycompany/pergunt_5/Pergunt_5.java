/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunt_5;

import java.util.Scanner;

/**
 *
 * @author f.silva
 */
public class Pergunt_5 {

    public static void main(String[] args) {
        
        int codUsuario;
        int codSenha;
        final int Usuario = 1234;
        final int Senha = 9999;
        Scanner in;
        
        System.out.print("Insira o codigo do usuario: ");
        in = new Scanner(System.in);
        
        codUsuario = in.nextInt();
        if (codUsuario == Usuario) {
            System.out.print("Insira a senha do usuario: ");
            in = new Scanner(System.in);

            codSenha = in.nextInt();
            if (codSenha == Senha) {
                System.out.print("Acesso permitido!");
            } else {
                System.out.print("Senha incorreta");
            }
        } else {
            System.out.print("Usuario invalido!");
        }
    }
}
