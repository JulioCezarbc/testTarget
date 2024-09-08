package org.example.exercicios;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.example.Main;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exec3 {
    public void faturamento(){
        try {
            InputStreamReader fileReader = new InputStreamReader(Main.class.getClassLoader().getResourceAsStream("faturamento.json"));
            if (fileReader == null) {
                System.out.println("O arquivo não foi encontrado no caminho especificado.");
                return;
            }
            JsonArray jsonArray = JsonParser.parseReader(fileReader).getAsJsonArray();
            List<Double> faturamentos = new ArrayList<>();
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;

            for (JsonElement jsonElement : jsonArray) {
                JsonObject faturamentoObj = jsonElement.getAsJsonObject();
                if (faturamentoObj.has("valor") && !faturamentoObj.get("valor").isJsonNull()) {
                    double valor = faturamentoObj.get("valor").getAsDouble();
                    faturamentos.add(valor);
                }
            }

            for (double faturamento : faturamentos) {
                if (faturamento < menorValor) {
                    menorValor = faturamento;
                }
                if (faturamento > maiorValor) {
                    maiorValor = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }


            double mediaMensal = somaFaturamento / diasComFaturamento;

            int diasAcimaMedia = 0;
            for (double faturamento : faturamentos) {
                if (faturamento > mediaMensal) {
                    diasAcimaMedia++;
                }
            }
            System.out.println("\nMenor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
