public class Produto {
    private String nome;
    private double preco;
    private double quantidadeEmEstoque;

    public Produto(String nome, double preco, double quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual < 101) {
            preco = preco - (preco * percentual/100);
            System.out.println("Preço final: " + preco);
        } else {
            System.out.println("Percentual invalido");
        }
    }

    public void adicionarEstoque(double quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque atual: " + quantidadeEmEstoque);
    }

    public void vender(double quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada");
            System.out.println("Novo estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Não existe estoque desse produto");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidadeEmEstoque);
    }
}
