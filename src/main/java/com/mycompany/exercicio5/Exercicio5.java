package com.mycompany.exercicio5;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio5 {

    public static void main(String[] args) {
//        Entrada de dados digitda pelo usuário
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite uma medida em metros: ");
    double metros = entrada.nextDouble();
    entrada.close();
    
//    Operação para conversão das medidas
    double centimetros = metros * 100;
    System.out.print(metros + "metros, corresponde á " + centimetros + " centímetros.");
    }
}
