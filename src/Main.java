package automato;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /**
         * Aqui será feita a chamada dos métodos das classes Expression e
         * Atribution de acordo com aa necessidades do programa vai ser
         * necessário validar antes se a String é uma atribuição de um valor a
         * uma variável ou se é uma expressão antes da chamada dos métodos
         */

        String nome = "arq.txt";

        try {
            FileReader arquivo = new FileReader(nome);

            BufferedReader leitura = new BufferedReader(arquivo);

            String linha = leitura.readLine();

            while (linha != null) {
                System.out.println(linha + "\n"); //mostra o que está escrito na linha

                linha = leitura.readLine(); //lê a próxima linha
            }

            arquivo.close();

        } catch (IOException e) {
            System.err.println("Erro na leitura do arquivo");

        }
    }
}
