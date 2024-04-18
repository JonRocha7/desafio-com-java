import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jonatas Oliveira Rocha";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int operacao = 0;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu;
        menu = """
                ** Digite a opção desejada **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
               
                """;

        Scanner leitura = new Scanner(System.in);

        while (operacao != 4) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1) {
                System.out.println("O seu saldo atual é: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double  valor = leitura.nextDouble();
                if(valor > saldo) {
                    System.out.println("Valor insulficiente para transferir");
                } else {
                    saldo -= valor;
                    System.out.println("Valor transferido com sucesso!");
                }
            } else if (operacao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor atual: " + saldo);
            } else if (operacao != 4) {
                System.out.println("digite uma opção valida");
            }

        }

    }
}
