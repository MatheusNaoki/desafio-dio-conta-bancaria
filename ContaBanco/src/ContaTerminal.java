import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int numeroUsuario;
        int numeroAgencia = Integer.valueOf(args[0]);
        String agencia = args[1];
        String nomeDoCliente = args[2];
        String sobrenomeDoCliente = args[3];
        Double saldo = Double.valueOf(args[4]);

        System.out.println("Por favor, digite o número da Agência: ");
        numeroUsuario = scanner.nextInt();

        if(numeroUsuario == numeroAgencia)
        {
           System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeDoCliente, sobrenomeDoCliente, agencia, numeroAgencia, saldo); 
        }
        else
        {
            System.out.println("Não existe conta para este numero.");
        }
    }
}
