package br.com.javacore.introducaoclasses.test;

import br.com.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro astra = new Carro();
        astra.modelo = "CD - 2003";
        astra.placa = "ADX-2220";
        astra.velocidadeMaxima = 220f;

        System.out.println("A MARCA DO CARRO É: " + astra.modelo);
        System.out.println("A PLACA DO CARRO É: " + astra.placa);
        System.out.println("A VELOCIDADE MAXIMA ATINGIDA É: " + astra.velocidadeMaxima);


    }
}
