import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        String agencia = "";
        String nomeCliente = "";
        float saldo;

        agencia ="";
        nomeCliente = "";

        System.out.println("Por favor, digite o número da Agência !");
        numero = s.nextInt();
        s.nextLine();
        System.out.print("Por favor, digite o nome da Agência !\n");

        agencia += s.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente !\n");
        nomeCliente += s.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        saldo = s.nextFloat();
        s.close();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
