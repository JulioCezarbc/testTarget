package org.example.exercicios;

public class Exec5 {
    public String inverter() {
        String input = "Inverter";
        char[] caracteres = input.toCharArray();
        String invertida = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        return invertida;
    }
}
