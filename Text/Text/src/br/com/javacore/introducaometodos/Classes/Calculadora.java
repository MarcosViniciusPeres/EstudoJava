package br.com.javacore.introducaometodos.Classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);

    }

    public void subtrairNumeros() {
        System.out.println(4 - 3);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {

        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não foi possivel fazer a divisão");
        }
        return 0;
    }

    public void imprimeDoisNumerosDividos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Impossivel dividir por zero");

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("NUM1: " + num1);
        System.out.println("NUM2: " + num2);
    }

    public void somarArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;


        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }
}