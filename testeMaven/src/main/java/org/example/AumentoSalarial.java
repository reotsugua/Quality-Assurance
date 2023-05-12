import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1100.0; // valor do salário mínimo atual em reais
        double aumentoPercentual;

        System.out.print("Digite o percentual de aumento do salário: ");
        aumentoPercentual = scanner.nextDouble();

        double aumento = salarioMinimo * aumentoPercentual / 100.0;
        double salarioReajustado = salarioMinimo + aumento;

        System.out.printf("Salário: R$ %.2f%n", salarioMinimo);
        System.out.printf("Salário reajustado com aumento de %.2f%%: R$ %.2f%n", aumentoPercentual, salarioReajustado);

        scanner.close();
    }
}
