import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do titular da conta:");

        String nome = scanner.nextLine();

        System.out.println("Digite sua Agência :");

        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta:");

        int conta = scanner.nextInt();

        System.out.println("Digite o saldo da conta:");

        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
