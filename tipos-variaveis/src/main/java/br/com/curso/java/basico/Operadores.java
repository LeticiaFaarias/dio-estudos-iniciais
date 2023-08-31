package br.com.curso.java.basico;

public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "LETICIA";
        String nomeDois = new String("LETICIA");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) { //true
            System.out.println( "a nossa condição é verdadeira");
        }

        System.out.println("numero Um é igual a numero Dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero Um é diferente de numero Dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero Um é maior que numero Dois? " + simNao);

        // OPERADORES LÓGICOS && e || Ou
        // Exemplos abaixo

        boolean condicao1=true;

        boolean condicao2=true;

        if(condicao1 && ( 7 > 4 ) ){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("fim");
    }
}



