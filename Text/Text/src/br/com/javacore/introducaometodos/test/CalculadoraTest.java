package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.Classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtrairNumeros();
        calc.multiplicaDoisNumeros(10, 10);
        System.out.println("Divisão de dois numeros: ");
        double result = (calc.divideDoisNumeros(20,1));
        System.out.println(result);
        System.out.println("Imprimindo dois numeros dividios");
        calc.imprimeDoisNumerosDividos(20,0);
        System.out.println("Continua a execução.");

        int[] numeros = new int[]{1,2,3,4,5};
        calc.somarArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }


}
