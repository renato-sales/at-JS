import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = scan.nextLine();
        
        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = Integer.parseInt(scan.nextLine());
        
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scan.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta!");
        double saldoConta = Double.parseDouble(scan.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}
