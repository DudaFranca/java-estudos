public class Main {
    public static void main(String[] args) {
        Estoque estoqueProdutos = new Estoque();

        estoqueProdutos.adicionarProduto("Arroz", 3);
        estoqueProdutos.adicionarProduto("Feijão", 2);
        estoqueProdutos.adicionarProduto("Macarrão", 5);
        estoqueProdutos.adicionarProduto("Molho", 5);

        estoqueProdutos.listarProdutos();
        System.out.println("------------------------");

        estoqueProdutos.removerProduto("Molho");
        System.out.println("Lista nova:");
        estoqueProdutos.listarProdutos();
        System.out.println("------------------------");

        estoqueProdutos.atualizarQuantidade("Arroz", 2);
        System.out.println("Lista nova:");
        estoqueProdutos.listarProdutos();
    }
}