package br.com.introducao.controleDeFluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " TOTAL PAGO " + valorParcela);
            } else {
                System.out.println("Saindo do Laço");
                break;

            }
            System.out.println("FORA DO LAÇO");
        }
    }
}