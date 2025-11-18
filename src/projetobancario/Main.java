package projetobancario;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // DECLARAR VARIÁVEIS
        double saldo = 0;
        boolean ativo = true;
        int escolha;

        while(ativo){
            // EXIBIR MENU

            System.out.println("----------------------------------");
            System.out.println("Banco");
            System.out.println("----------------------------------");
            System.out.println("1. Mostrar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("----------------------------------");

            // OBTER E PROCESSAR ESCOLHA DO USUÁRIO

            System.out.print("Ensira sua Escolha (1-4): ");
            escolha = scanner.nextInt();

            switch(escolha){
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo = saldo + deposito();
                case 3 -> saldo = saldo - sacar(saldo);
                case 4 -> ativo = false;
                default -> System.out.println("ESCOLHA INVÁLIDA");
            }
        }

        // MENSAGEM DE SAIDA

        System.out.println("----------------------------------");
        System.out.println("Obrigado! Tenha um bom dia!");




        scanner.close();
    }
    // MOSTRAR SALDO
    static void mostrarSaldo(double saldo){
        System.out.println("----------------------------------");
        System.out.printf("R$%.2f\n", saldo);
    }
    // DEPÓSITO
    static double deposito(){

        double valor;

        System.out.print("Insira um valor para ser depositado: ");

        valor = scanner.nextDouble();

        if(valor < 0){
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else{
            return valor;
        }

    }
    // SACAR
    static double sacar(double saldo){

        double valor;
        System.out.print("Insira a quantidade a ser sacada: ");
        valor = scanner.nextDouble();

        if(valor > saldo){
            System.out.println("Fundo Insuficiente.");
            return 0;
        } else if(valor < 0){
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else{
            return valor;
        }
    }
}

