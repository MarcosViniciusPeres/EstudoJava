package br.com.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 20;
        dias[1][0] = 15;
        dias[1][1] = 40;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }
        }
        System.out.println("---------------------------------");
        for(int[] ref : dias){
            for(int aux : ref){
                System.out.println(aux);
            }
        }
    }

}