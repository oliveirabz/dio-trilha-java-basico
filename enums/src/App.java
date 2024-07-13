import enums.EstadoBrasileiro;

public class App {
    public static void main(String[] args) throws Exception {
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNomeUppercase());
        }

        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO;

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
    }
}
