import java.util.ArrayList;

public class GerenciadorNomes {
    ArrayList<String> nomes = new ArrayList<>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    public void removerNome(String nome) {
        nomes.remove(nome);
    }

    public void verificarNome(String nome) {
        System.out.println("Contém " + nome + "? " + nomes.contains(nome));
    }

    public void listarNomes() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
