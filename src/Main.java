import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Qual operação (+, -, *, /):");
        char operacao = sc.next().charAt(0);
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else System.out.println("Erro: Divisão por zero!");
                break;

            default:
                System.out.println("Operação inválida! =( ");

                sc.close();
        }

    }

}