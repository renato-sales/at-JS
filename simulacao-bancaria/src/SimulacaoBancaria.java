import java.util.Scanner;

public class SimulacaoBancaria {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                  double valorDepositado = Double.parseDouble(scanner.nextLine());
                try{
                  if(valorDepositado <= 0){
                    throw new Exception();
                  }
                }
                catch(Exception exception){
                  System.out.println("Deposito inválido.");
                }
                saldo += valorDepositado;
                System.out.println("Saldo atual: " + saldo);
                break;
            case 2:
                // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                  double valorSaque = Double.parseDouble(scanner.nextLine());
                try{
                  if(valorSaque > saldo){
                    throw new Exception();
                  }
                  saldo -= valorSaque;
                  System.out.println("Saldo atual: " + saldo);
                }
                catch(Exception exception){
                  System.out.println("Saldo insuficiente.");
                }
                break;
            case 3:
                // TODO: Exibir o saldo atual da conta.
                System.out.println("Saldo atual: " + saldo);
                break;
            case 0:
                System.out.println("Programa encerrado.");
                continuar = false;  // Atualiza a variável de controle para encerrar o loop
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    scanner.close();
  }
}
