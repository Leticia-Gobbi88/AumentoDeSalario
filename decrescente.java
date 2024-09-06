import java.util.Scanner;
import java.util.Arrays;

public class decrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int num3 = scanner.nextInt();


        int[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("Os números em ordem decrescente são: "
                + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);

        scanner.close();
    }
}

