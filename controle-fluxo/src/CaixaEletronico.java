public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo atual é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Seu saldo atual é: " + saldo);
        }
    }
}
