public class Atribution {
    /**
     * método vai validar se a expressão é verdadeira de acordo com a regra
     * (ID) (=) (a..z)começa com letra minúscula (Aa..Zz || 0..9 || _)seguido de uma sequência de letras ou números ou "_"(;)
     * @param exp
     * @return
     */
    public boolean validate(String exp){

        return true;
    }

    /**
     * método vai validar se uma String é um ID válido de acordo com a regra
     * ID = a..z (começa com uma letra minúscula) Aa..Zz || 0..9 || _ (seguido por uma sequência de letras maíuscula ou minúsculas ou números ou "_")
     * precisa verificar também se o ID foi atribuído anteriormente
     * @param str
     * @return se a String preencher essa regra, ele retorna true
     */
    public boolean isId(String str){

        return true;
    }

    /**
     * método vai validar se uma String é um número de acordo com a regra
     * num = 0..9 (qualquer sequência de números de 0 á 9)
     * @param str
     * @return se a String preencher essa regra, ele retorna true
     */
    public boolean isNum(String str){

        return true;
    }
}
