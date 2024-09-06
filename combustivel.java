import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        // Definindo os preços por litro
        final double PRECO_ALCOOL = 3.50;  // preço por litro de álcool
        final double PRECO_GASOLINA = 5.00;  // preço por litro de gasolina

        Scanner scanner = new Scanner(System.in);

        // Leitura do tipo de combustível
        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

        // Leitura da quantidade de litros vendidos
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double valorTotal = 0.0;
        double desconto = 0.0;

        // Calcula o valor a ser pago com base no tipo de combustível
        if (tipoCombustivel == 'A') {
            if (litrosVendidos <= 20) {
                desconto = PRECO_ALCOOL * 0.03;  // 3% de desconto por litro
            } else {
                desconto = PRECO_ALCOOL * 0.05;  // 5% de desconto por litro
            }
            valorTotal = litrosVendidos * (PRECO_ALCOOL - desconto);
        } else if (tipoCombustivel == 'G') {
            if (litrosVendidos <= 20) {
                desconto = PRECO_GASOLINA * 0.04;  // 4% de desconto por litro
            } else {
                desconto = PRECO_GASOLINA * 0.06;  // 6% de desconto por litro
            }
            valorTotal = litrosVendidos * (PRECO_GASOLINA - desconto);
        } else {
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        // Imprime o valor final a ser pago
        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}

