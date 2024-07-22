public class Main {
    public static void main(String[] args) {
        Cliente bruna = new Cliente();
        bruna.setNome("Bruna");

        Conta cc = new ContaCorrente(bruna);
        Conta poupanca = new ContaPoupanca(bruna);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco();
        banco.adicionarConta(poupanca);
        banco.listarContasPorNome();
    }
}
