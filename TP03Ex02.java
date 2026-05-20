// TP03 - Exercício 02
// Programa para testar a classe Hora
// Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

public class TP03Ex02 {

    public static void main(String[] args) {

        Hora h1 = new Hora();

        System.out.println("\nHora formato 1: " + h1.getHora1());
        System.out.println("Hora formato 2: " + h1.getHora2());
        System.out.println("Total em segundos: " + h1.getSegundos());

        Hora h2 = new Hora(13, 45, 20);

        System.out.println("\nHora formato 1: " + h2.getHora1());
        System.out.println("Hora formato 2: " + h2.getHora2());
        System.out.println("Total em segundos: " + h2.getSegundos());
    }
}
