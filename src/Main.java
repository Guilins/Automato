import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) throws Exception {
        /**
         * Aqui será feita a chamada dos métodos das classes Expression e
         * Atribution de acordo com aa necessidades do programa vai ser
         * necessário validar antes se a String é uma atribuição de um valor a
         * uma variável ou se é uma expressão antes da chamada dos métodos
         */

        String nome = "arq.txt";
        Hashtable<String, Float> identificadores = new Hashtable<String, Float>();
        float resultado = 0;

        try {
            FileReader arquivo = new FileReader(nome);

            BufferedReader leitura = new BufferedReader(arquivo);

            String linha = leitura.readLine();

            String identificador ="";
            String numero ="";

            boolean flag = true;

            while (linha != null) {
                System.out.println(linha + "\n");

                for(int i = 0; i < linha.length() ;i++){

                    linha.charAt(i);
                    char valor = linha.charAt(i);

                    //lendo primeira letra minuscula
                    if(i==0){
                        if(
                                valor == 'a' || valor == 'b' || valor == 'c' ||
                                        valor == 'd' || valor == 'e' || valor == 'f' ||
                                        valor == 'g' || valor == 'h' || valor == 'i' ||
                                        valor == 'j' || valor == 'k' || valor == 'l' ||
                                        valor == 'm' || valor == 'n' || valor == 'o' ||
                                        valor == 'p' || valor == 'q' || valor == 'r' ||
                                        valor == 's' || valor == 't' || valor == 'u' ||
                                        valor == 'v' || valor == 'x' || valor == 'w' ||
                                        valor == 'y' || valor == 'z'
                                ){
                            identificador += valor;
                            //se não for uma letra minuscula o id se torna inválido
                        }else{
                            System.out.println("Erro léxico: um ID deve iniciar com uma letra minuscula");
                            throw new Exception();
                        }
                        //lendo a partir do segundo caracter
                    }else if(flag&&
                            (valor == 'a' || valor == 'b' || valor == 'c' ||
                                    valor == 'd' || valor == 'e' || valor == 'f' ||
                                    valor == 'g' || valor == 'h' || valor == 'i' ||
                                    valor == 'j' || valor == 'k' || valor == 'l' ||
                                    valor == 'm' || valor == 'n' || valor == 'o' ||
                                    valor == 'p' || valor == 'q' || valor == 'r' ||
                                    valor == 's' || valor == 't' || valor == 'u' ||
                                    valor == 'v' || valor == 'x' || valor == 'w' ||
                                    valor == 'y' || valor == 'z' ||
                                    valor == '1' || valor == '2' || valor == '3' ||
                                    valor == '4' || valor == '5' || valor == '6' ||
                                    valor == '7' || valor == '8' || valor == '9' ||
                                    valor == '0' || valor == '_'
                            )){
                        identificador += valor;
                        //se o valor for um espaço o flag irá sinalizar que acabou a leitura do nome do ID e agora será feita a leitura do valor da atribuição
                    }else if(valor == ' '){
                        flag = false;
                        if(linha.charAt(i+1)== '='){
                            if(linha.charAt(i+2)== ' '){
                                for(int j = i+3; j < linha.length();j++ ){
                                    if(
                                            //só são aceitos números entre 0 e 9 na atribuição
                                            linha.charAt(j) == '1' || linha.charAt(j) == '2' || linha.charAt(j) == '3' ||
                                                    linha.charAt(j) == '4' || linha.charAt(j) == '5' || linha.charAt(j) == '6' ||
                                                    linha.charAt(j) == '7' || linha.charAt(j) == '8' || linha.charAt(j) == '9' ||
                                                    linha.charAt(j) == '0'
                                            ){
                                        numero += linha.charAt(j);
                                    }
                                    //se a leitura estiver no final da linha então é feita a atribuiição através de um hash e as variáveis utilizadas são resetadas
                                    else if(linha.charAt(j) == ';'){
                                        System.out.println("numero "+numero);
                                        identificadores.put(identificador, Float.parseFloat(numero));
                                        numero = "";
                                        linha = leitura.readLine();
                                        i = -1;
                                        break;
                                    }else{
                                        throw new Exception();
                                    }
                                }
                            }
                        }
                    }
                    if(linha.length() == 0)
                        break;
                }
                flag = true;
                int j = 0;
                int inicio = 0;

                ArrayList<Float> valores = new ArrayList<Float>();


                String exp = "";
                String id = "";
                ArrayList<Character> op = new ArrayList<Character>();

                for(int i = 0; i < linha.length(); i++){
                    char valor = linha.charAt(i);
                    if(i==0){
                        if(
                                //iniciando a leitura da primeira letra minuscula do ID da expressão
                                valor == 'a' || valor == 'b' || valor == 'c' ||
                                        valor == 'd' || valor == 'e' || valor == 'f' ||
                                        valor == 'g' || valor == 'h' || valor == 'i' ||
                                        valor == 'j' || valor == 'k' || valor == 'l' ||
                                        valor == 'm' || valor == 'n' || valor == 'o' ||
                                        valor == 'p' || valor == 'q' || valor == 'r' ||
                                        valor == 's' || valor == 't' || valor == 'u' ||
                                        valor == 'v' || valor == 'x' || valor == 'w' ||
                                        valor == 'y' || valor == 'z'
                                ){
                            System.out.print(""+valor);
                            exp += valor;
                        }else{
                            System.out.println("Erro léxico: um ID deve iniciar com uma letra minuscula");
                            throw new Exception();
                        }
                        //fazendo a leitura do resto do ID da expressão
                    }else if(flag&&
                            (valor == 'a' || valor == 'b' || valor == 'c' ||
                                    valor == 'd' || valor == 'e' || valor == 'f' ||
                                    valor == 'g' || valor == 'h' || valor == 'i' ||
                                    valor == 'j' || valor == 'k' || valor == 'l' ||
                                    valor == 'm' || valor == 'n' || valor == 'o' ||
                                    valor == 'p' || valor == 'q' || valor == 'r' ||
                                    valor == 's' || valor == 't' || valor == 'u' ||
                                    valor == 'v' || valor == 'x' || valor == 'w' ||
                                    valor == 'y' || valor == 'z' ||
                                    valor == '1' || valor == '2' || valor == '3' ||
                                    valor == '4' || valor == '5' || valor == '6' ||
                                    valor == '7' || valor == '8' || valor == '9' ||
                                    valor == '0' || valor == '_'
                            )){
                        exp += valor;
                    }else if(valor == '=' ) {
                        flag = false;
                        j = i+1;
                        inicio = j;
                        break;
                    }

                }
                for(j = j+1;j<linha.length();j++){
                    char valor = linha.charAt(j);
                    if(j == inicio) {
                        if (
                            //iniciando a leitura da primeira letra minuscula do ID para ser processado
                                valor == 'a' || valor == 'b' || valor == 'c' ||
                                        valor == 'd' || valor == 'e' || valor == 'f' ||
                                        valor == 'g' || valor == 'h' || valor == 'i' ||
                                        valor == 'j' || valor == 'k' || valor == 'l' ||
                                        valor == 'm' || valor == 'n' || valor == 'o' ||
                                        valor == 'p' || valor == 'q' || valor == 'r' ||
                                        valor == 's' || valor == 't' || valor == 'u' ||
                                        valor == 'v' || valor == 'x' || valor == 'w' ||
                                        valor == 'y' || valor == 'z'
                                ) {
                            id += valor;
                        } else {
                            System.out.println("Erro léxico: um ID deve iniciar com uma letra minuscula");
                            System.out.println(""+valor);
                            throw new Exception();
                        }
                    }else if(valor == 'a' || valor == 'b' || valor == 'c' ||
                                valor == 'd' || valor == 'e' || valor == 'f' ||
                                valor == 'g' || valor == 'h' || valor == 'i' ||
                                valor == 'j' || valor == 'k' || valor == 'l' ||
                                valor == 'm' || valor == 'n' || valor == 'o' ||
                                valor == 'p' || valor == 'q' || valor == 'r' ||
                                valor == 's' || valor == 't' || valor == 'u' ||
                                valor == 'v' || valor == 'x' || valor == 'w' ||
                                valor == 'y' || valor == 'z' ||
                                valor == '1' || valor == '2' || valor == '3' ||
                                valor == '4' || valor == '5' || valor == '6' ||
                                valor == '7' || valor == '8' || valor == '9' ||
                                valor == '0' || valor == '_'){
                            id += valor;
                    }if(j != linha.length() - 1) {
                        if (linha.charAt(j + 1) == '+' || linha.charAt(j + 1) == '-' || linha.charAt(j + 1) == '*' || linha.charAt(j + 1) == '/') {
                            try {
                                valores.add(identificadores.get(id));
                            } catch (Exception e) {
                                System.out.println("erro: variável '" + id + "' não declarada");
                                e.printStackTrace();
                            }
                            op.add(linha.charAt(j + 1));
                            j = j + 2;
                            valor = linha.charAt(j);
                        }
                    }
                    if(linha.charAt(j) == ';')
                        break;
                }
                for(int i = 1; i < valores.size(); i++){
                    for(int k = 0; k < op.size(); k++){
                        if(op.get(k) == '*')
                            resultado += valores.get(j) * valores.get(k+1);
                        if(op.get(k) == '/')
                            resultado += valores.get(j) / valores.get(k+1);
                        op.remove(k);
                        valores.remove(k);
                        valores.remove(j + 1);
                    }
                    if(op.get(i-1) == '+')
                        resultado += valores.get(i) + valores.get(i+1);
                    if(op.get(i-1) == '-')
                        resultado += valores.get(i) - valores.get(i+1);
                }
            }
                System.out.println("O resultado da expressão é: "+ resultado);
                identificador = "";
                linha = leitura.readLine();

            arquivo.close();

        } catch (IOException e) {
            System.err.println("Erro na leitura do arquivo");

        }
    }
}
