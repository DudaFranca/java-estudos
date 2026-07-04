import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorNomes gerenciadorNomes = new GerenciadorNomes();
        Scanner scanner = new Scanner(System.in);

        boolean rodar = true;

        while (rodar) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar ");
            System.out.println("2 - Remover ");
            System.out.println("3 - Buscar ");
            System.out.println("4 - Listar ");
            System.out.println("0 - Sair ");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "1":
                    System.out.print("Digite um nome: ");
                    entrada = scanner.nextLine();
                    gerenciadorNomes.adicionarNome(entrada);
                    gerenciadorNomes.listarNomes();
                    break;
                case "2":
                    System.out.print("Qual nome você deseja remover? ");
                    entrada = scanner.nextLine();
                    gerenciadorNomes.removerNome(entrada);
                    break;
                case "3":
                    System.out.print("Qual nome deseja buscar? ");
                    entrada = scanner.nextLine();
                    gerenciadorNomes.verificarNome(entrada);
                    break;
                case "4":
                    gerenciadorNomes.listarNomes();
                    break;
                case "0":
                    rodar = false;
                    break;
            }
        }
    }
}