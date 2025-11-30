import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta; // ou Conta conta = new Conta();

        System.out.print("Digite o numero da conta: ");
        int number = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine(); // necessario para a quebra de linha acontecer normalmente
        String holder = sc.nextLine();
        System.out.print("Com deposito inicial? (y/n)");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(number, holder, depositoInicial);
        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Conta atual: ");
        System.out.println(conta.toString());
        
        System.out.println();
        System.out.print("Digite o valor do deposito: ");
        double depositValue = sc.nextDouble();
        conta.deposito(depositValue);
        System.out.println("Atualizacao da conta atual: ");
        System.out.println(conta.toString());

        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        conta.saque(withdrawValue);
        System.out.println("Atualizacao da conta atual: ");
        System.out.println(conta.toString());

        sc.close();

    }
}
