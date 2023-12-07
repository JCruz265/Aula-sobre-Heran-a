package App;

import entities.Conta;
import exceptions.NegocioException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Metodo para entrada e saida padrão USA
        Locale.setDefault(Locale.US);
        //instanciação do Metodo de entrada
        Scanner sc = new Scanner(System.in);
        //instanciação da lista do tipo conta
        List<Conta> contas = new ArrayList<>();
        //
        String resp = "";
        //
        while (true) {
            System.out.println("Informe os dados do cliente");
            if (!resp.equalsIgnoreCase("")) {
                sc.nextLine();
            }
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Número: ");
            int id = sc.nextInt();
            System.out.print("Deposito Inicial: ");
            double valor = sc.nextDouble();
            System.out.print("Limite para saque: ");
            double limite = sc.nextDouble();
            contas.add(new Conta(id, nome, valor,limite));
            System.out.println("Deseja continuar");
            resp = sc.next();
            if (!resp.equalsIgnoreCase("sim")) {
                break;
            }
        }
        System.out.println("----------------");

        for (Conta x : contas) {
            System.out.println(x);
        }
        System.out.println("----------------");
        System.out.print("Informe o número da conta: ");
        int num = sc.nextInt();
        int k =0;
        for (int i = 0; i < contas.size();i++) {
            if(num == contas.get(i).getNumero()){
                k = i;
            }
        }
        System.out.println(contas.get(k));
        resp = "";
        while (true){
        System.out.print("Informe uma quantia para sacar: ");
        double quantia = sc.nextDouble();

        try {
            contas.get(k).saque(quantia);
            System.out.printf("Novo saldo: %.2f%n", contas.get(k).getSaldo());
        }
        catch (NegocioException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Deseja continuar");
        resp = sc.next();
        if (!resp.equalsIgnoreCase("sim")) {
            break;
        }}

        sc.close();
    }
}
