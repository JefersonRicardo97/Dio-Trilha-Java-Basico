
package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendido = false;
        do {

            atendido = atender();
            continuarTentando = !atendido;
            if (continuarTentando) {
                System.out.println("Tentativa de contato: " + tentativas);
                tentativas++;
            }
        } while (continuarTentando && tentativas < 3);

        if (atendido) {
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " na tentativa " + tentativas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        System.out.println("imprimindo candidatos informando o indice dos elementos");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println(" o Candidato de n " + (indice + 1) + "é o" + candidatos[indice]);
        }
        System.out.println("imprimindo candidatos for each");
        for (String candidato : candidatos) {
            System.out.println("O Candidato selecionado é: " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Luiz",
                "Marta" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioBase = 2000.0;
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Prentende ganhar esse Sálario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("Candidato Selecionado: " + candidato);
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase >= salarioPretendido) {
            System.out.println("Ligar Para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os resultados dos demais candidatos");
        }
    }
}
