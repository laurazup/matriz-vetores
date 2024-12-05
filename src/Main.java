import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] listaDeCompras = {"Arroz", "Feijão", "Leite", "Pão", "Ovos"};
        System.out.println(listaDeCompras[0]);
        System.out.println(listaDeCompras[4]);
//        System.out.println(listaDeCompras[5]);
//        Index 5 out of bounds for length 5
//        at Main.main(Main.java:6)

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matriz[1][1]);

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println(numeros[0]);
        numeros[0] = scanner.nextInt();
        System.out.println(numeros[0]);
    }
}