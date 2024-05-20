import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu saldo ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá,"+ nomeCliente+","+"obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência"+":" + agencia +","+"e conta" + numero);
        System.out.println("e seu saldo"+"R$:" + saldo + "já está disponível para saque");

    }
}
