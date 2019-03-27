package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.Classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1,num2);
        System.out.println("DENTRO DO TESTE");
        System.out.println("NUM1: "+num1);
        System.out.println("NUM2: "+num2);
    }
}
