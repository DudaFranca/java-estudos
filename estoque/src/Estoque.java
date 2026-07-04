import java.util.HashMap;

public class Estoque {
    HashMap<String, Integer> produtos = new HashMap<>();

    public void adicionarProduto(String produto, Integer quantidade) {
        produtos.put(produto, quantidade);
    }

    public void atualizarQuantidade(String produto, Integer quantidade) {
        produtos.put(produto, quantidade);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (String nome : produtos.keySet()) {
            System.out.println(nome + " → " + produtos.get(nome));
        }
    }
}
