package application;

import java.util.Locale;
import java.util.Scanner;

import model.Exceptions.excecoes;
import model.entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados da conta: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numero, titular, saldo, limiteSaque);

        System.out.println();

        System.out.print("Digite a quantia para retirada: ");
        double quantia = sc.nextDouble();

        try{
            conta.saque(quantia);
            System.out.printf("Novo saldo: %.2f\n ", conta.getSaldo());
        }
        catch(excecoes e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
