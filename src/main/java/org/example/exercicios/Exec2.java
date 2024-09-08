package org.example.exercicios;

public class Exec2 {
    public void Fibonacci(int x) {
        int a =0, b=1,prx=0;

        while (prx < x){
            prx = a + b;
            a = b;
            b = prx;
        }
        if (prx == x) System.out.println(x + " é da sequencia Fibonacci");
        else System.out.println(x + " não é da sequencia Fibonacci");
    }
}
