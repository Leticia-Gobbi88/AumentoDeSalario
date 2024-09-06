import java.util.Scanner;

public class equation{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de A
        System.out.print("Digite o valor de a (coeficiente do termo quadrático): ");
        double a = scanner.nextDouble();

        // Verifica se A é igual a zero
        if (a == 0) {
            System.out.println("O valor de a é 0, portanto, não é uma equação do segundo grau.");
        } else {
            // Solicita os valores de B e C
            System.out.print("Digite o valor de b (coeficiente do termo linear): ");
            double b = scanner.nextDouble();
            System.out.print("Digite o valor de c (coeficiente independente): ");
            double c = scanner.nextDouble();

            // Calcula o delta
            double delta = (b * b) - (4 * a * c);

            // Verifica o valor de delta e calcula as raízes
            if (delta < 0) {
                System.out.println("O delta é negativo (" + delta + "), a equação não possui raízes reais.");
            } else if (delta == 0) {
                double raizUnica = -b / (2 * a);
                System.out.println("O delta é zero, a equação possui uma única raiz real: " + raizUnica);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("O delta é positivo (" + delta + "), a equação possui duas raízes reais:");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        scanner.close();
    }
}
