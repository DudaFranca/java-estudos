import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estoque");

        Produto produto = new Produto("Cloro", 28, 10);
        Scanner scanner = new Scanner(System.in);

        boolean rodar = true;

        while (rodar) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Aplicar desconto ");
            System.out.println("2 - Adicionar Estoque ");
            System.out.println("3 - Vender ");
            System.out.println("4 - Exibir ");
            System.out.println("0 - Sair ");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "1":
                    System.out.println("Adicionar Desconto");
                    double percentual = Double.parseDouble(scanner.nextLine());
                    produto.aplicarDesconto(percentual);
                    break;
                case "2":
                    System.out.println("Adicionar estoque");
                    double quantidade = Double.parseDouble(scanner.nextLine());
                    produto.adicionarEstoque(quantidade);
                    break;
                case "3":
                    System.out.println("Vender:");
                    double venda = Double.parseDouble(scanner.nextLine());
                    produto.vender(venda);
                    break;
                case "4":
                    System.out.println("Estoque:");
                    produto.exibirDados();
                    break;
                case "0":
                    rodar = false;
                    break;
            }
        }
    }
}