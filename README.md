# Automato
Aplicação em Java que simula um autômato que valida uma atribuição de uma variável ou uma expressão
Deve ser modelado e implementado um autômato que faça a
validação de atribuições. Além disso, após validar se a
atribuição é válida, a sua aplicação deverá fazer a conta e
informar o valor final da atribuição. Uma atribuição possui a
seguinte sintaxe:
identificador op_atrib (identificador | numero)(op_arit
(identificador | numero) )* pv
Sendo que:
• identificador: inicia por uma letra minúscula, seguido por
uma quantidade qualquer de letras minúsculas, dígitos ou
underline.
• op_atib: é representado pelo caractere ‘=’
• numero: inicia por um dígito, seguido por uma quantidade
qualquer de dígitos, podendo ter opcionalmente a parte
fracionária. Caso ele tenha a parte fracionária, ele
recebe o caractere ‘.’ , seguido de uma sequência de um ou
mais dígitos.
• op_arit: é representado por um dos operadores aritméticos
(‘+’ | ‘-‘ | ‘*’ | ‘/’ )
• pv: é representado pelo caractere ‘;’.
Os tokens são representados pelas seguintes expressões
regulares:
• identificador: [a-z] ( [a-z] | [0-9] | [_])*
• op_atrib: ‘=’
• numero: ( [0-9]([0-9])* ) | ( [0-9]([0-9])*’.’ [0-9]([0-
9])* )
• op_arit: (‘+’ | ‘-‘ | ‘*’ | ‘/’ )
• pv: ‘;’ 
Cada grupo deve modelar um autômato que reconheça uma
atribuição, respeitando a sintaxe descrita neste trabalho. O
autômato modelado pelo grupo deve ser implementado, sendo que a
sua implementação deve seguir o que foi modelado no autômato.
A entrada do autômato será um fluxo de caracteres no seguinte
formato:
- N linhas iniciais, na qual N é a quantidade de
identificadores (nomes de variáveis) na atribuição. Cada linha
terá: nome do identificador, espaço em branco, o caractere
igual, espaço em branco, valor da variável. Exemplo: bola = 10
. Neste exemplo, o nome do identificador é bola e o seu valor é
10.
- Uma linha em branco
- Uma linha com a atribuição (Obs: o processamento do autômato
ocorre nesta linha. As linhas anteriores são utilizadas para
definir os valores dos identificadores necessários para a
realização da conta na atribuição).
O autômato deverá informar se esta atribuição está correta ou
incorreta. Caso a atribuição esteja correta, ele deverá gerar
como resposta o valor da atribuição realizada.
Os grupos deverão informar a estrutura de dados utilizada para
implementar o autômato e como foi realizada a sua
implementação.

Linguagens Aceitas: Java, C, C++ e C#.
Devem ser entregues:
• o código fonte via Unidade Web (Link Atividades) (colocar
um arquivo txt explicando o passo a passo para a execução
do programa).
• o autômato e a explicação da sua implementação: impressos
e via Unidade Web.
O trabalho é em grupo de até 5 alunos.
