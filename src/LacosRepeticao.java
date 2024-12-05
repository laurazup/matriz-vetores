import java.util.Scanner;

public class LacosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        System.out.println("Digite 5 número:");

        for(int index = 0; index < numeros.length; index++) {
            System.out.println("Número da posição " + index + ":");
            numeros[index] = scanner.nextInt();
        }
        scanner.close();
    }
}
