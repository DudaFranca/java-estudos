public class ManipuladorTexto {
    public void analisarTexto(String textoAnalisado) {
        System.out.println("Caracteres: " + textoAnalisado.length());
        System.out.println("Minúsculo: " + textoAnalisado.toLowerCase());
        System.out.println("Maiúsculo: " + textoAnalisado.toUpperCase());
        System.out.println("Contém 'Java': " + textoAnalisado.contains("Java"));
        System.out.println("Sem espaços nas bordas: " + textoAnalisado.strip());
    }
}
