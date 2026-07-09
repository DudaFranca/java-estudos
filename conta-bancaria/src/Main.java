import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta bancaria");

        ContaBancaria contaBancaria = new ContaBancaria("Duda", "123");
        Scanner scanner = new Scanner(System.in);

        boolean rodar = true;

        while (rodar) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Depositar ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Ver extrato ");
            System.out.println("0 - Sair ");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "1":
                    System.out.println("Quanto deseja depositar?");
                    double deposito = Double.parseDouble(scanner.nextLine());
                    contaBancaria.depositar(deposito);

                    System.out.println("Saldo atualizado:");
                    contaBancaria.exibirDados();
                    break;
                case "2":
                    System.out.println("Quanto deseja sacar?");
                    double saque = Double.parseDouble(scanner.nextLine());
                    contaBancaria.sacar(saque);
                    System.out.println("Saldo atualizado:");
                    contaBancaria.exibirDados();
                    break;
                case "3":
                    System.out.println("Saldo:");
                    contaBancaria.exibirDados();
                    break;
                case "0":
                    rodar = false;
                    break;
            }
        }
    }
}