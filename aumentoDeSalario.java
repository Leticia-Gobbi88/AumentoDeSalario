import java.util.Scanner;

public class aumentoDeSalario {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();
        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 2800.00) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 7000.00) {
            percentualAumento = 15.0;
        } else if (salarioAtual <= 15000.00) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("\nSalário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário, após o aumento: R$ " + novoSalario);

        scanner.close();
    }
}


