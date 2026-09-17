import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int  resultado;
            int operacao, a, b;

            do {
                System.out.println("Digite o primeiro valor: ");
                a = sc.nextInt();

                System.out.println("Digite o segundo valor: ");
                b = sc.nextInt();

                System.out.println("\nEscolha a operação:");
                System.out.println("1. Somar ");
                System.out.println("2. Subtrair ");
                System.out.println("3. Multiplicar ");
                System.out.println("4. Dividir ");
                System.out.println("5. Sair ");

                System.out.println("Opção: ");

                operacao = sc.nextInt();

                switch (operacao) {

                    //Soma
                    case 1:
                        resultado = a + b;
                        System.out.printf("Resultado de %d + %d é igual a %d %n", a, b, resultado);
                        break;

                    //Subtração
                    case 2:
                        resultado = a - b;
                        System.out.printf("Resultado de %d - %d é igual a %f%n", a, b, resultado);
                        break;

                    //Multiplicação
                    case 3:
                        resultado = a * b;
                        System.out.printf("Resultado de %d * %d é igual a %f%n", a, b, resultado);
                        break;

                    //Divisão
                    case 4:
                        if (b != 0) {
                            double resultadoDiv = (double) a / b;
                            int resto = (a % b);
                            System.out.printf("Resultado de %d / %d é igual a %f (resto: %d)%n", a, b, resultadoDiv, resto);
                        } else {
                            System.out.println("Não é possivel dividir por zero!");
                        }
                        break;

                    case 5:
                        System.out.println("Obrigado por usar a calculadora! " +
                                "Desenvolvido por Rodrigo Silva");
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (operacao != 5);
            sc.close();
        }
}