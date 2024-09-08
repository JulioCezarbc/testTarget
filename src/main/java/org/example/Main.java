package org.example;

import org.example.exercicios.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Exercicio 1
        Exec1 resultado = new Exec1();
        System.out.println("Soma: " + resultado.soma() );

        // Exercicio 2
        System.out.print("\nInforme um numero: ");
        int x = entrada.nextInt();
        Exec2 fib = new Exec2();
        fib.Fibonacci(x);

        // Exercicio 3
        Exec3 fat = new Exec3();
        fat.faturamento();

        // Exercicio 4
        Exec4 porct = new Exec4();
        porct.porcetagemDistruibuidora();

        // Exercicio 5
        Exec5 exercicio5 = new Exec5();
        System.out.println("\nString invertida: " + exercicio5.inverter());

    }
}