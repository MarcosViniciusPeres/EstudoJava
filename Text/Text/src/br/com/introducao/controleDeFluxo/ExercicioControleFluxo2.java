package br.com.introducao.controleDeFluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo e não é um dia util");
                break;
            case 2:
                System.out.println("Hoje é segunda é um dia util");
                break;
            case 3:
                System.out.println("Hoje é terça é um dia util");
                break;
            case 4:
                System.out.println("Hoje é quarta é um dia util");
                break;
            case 5:
                System.out.println("Hoje é quinta é um dia util");
                break;
            case 6:
                System.out.println("Hoje é sexta é um dia util");
                break;
            case 7:
                System.out.println("Hoje é sabado e não é um dia util");
                break;
            default:
                System.out.println(" Opcao Invalida");
                break;
        }

    }
}
