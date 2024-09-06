import java.util.Scanner;

public class doisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Verifica qual é o maior e qual é o menor
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
            System.out.println("O menor número é: " + num2);
        } else if (num1 < num2) {
            System.out.println("O maior número é: " + num2);
            System.out.println("O menor número é: " + num1);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}

