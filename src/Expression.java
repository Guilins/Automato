import java.util.StringTokenizer;

public class Expression {
    Util util = new Util();
    /**
     * método vai validar se a expressão é verdadeira de acordo com as regras
     * (ID) (=)(ID || numero[0..9](operador[+, -, *, /](ID || numero[0..9])(;)
     * @param exp
     * @return se a expressão preencherl as regras ele retorna true
     */
    public int validate(String exp){


        StringTokenizer st = new StringTokenizer(exp);
        while (st.hasMoreTokens()){

        }
        return 0;
    }

    /**
     * método vai validar se uma String é um ID válido de acordo com a regra
     * ID = a..z (começa com uma letra minúscula) Aa..Zz || 0..9 || _ (seguido por uma sequência de letras maíuscula ou minúsculas ou números ou "_")
     * precisa verificar também se o ID foi atribuído anteriormente
     * @param str
     * @return se a String preencher essa regra, ele retorna true
     */
    public String ID(String str){
        String id;

        return id;
    }

    /**
     * método vai validar se uma String é um número de acordo com a regra
     * num = 0..9 (qualquer sequência de números de 0 á 9)
     * @param str
     * @return se a String preencher essa regra, ele retorna true
     */
    public boolean num(String str){

        return true;
    }

    /**
     * método vai realizar uma atribuição de uma variável seguindo o modelo do exercício
     * @param str
     * @return a String representando a atribuição (provavelmente um dictionary)
     */
    //incompleto
    public String attribution(String str){
        String[] line = util.lineSeparate(str);

        return str;
    }

}
