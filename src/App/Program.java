package App;

import entities.Conta;

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
        List<Conta> contas= new ArrayList<>();
        //
        String resp = "";
        //
        while(true){
        System.out.println("Informe os dados do cliente");
        if(!resp.equalsIgnoreCase("")){sc.nextLine();}
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Número: ");
        int id = sc.nextInt();
        System.out.print("Deposito Inicial: ");
        double valor = sc.nextDouble();
        contas.add(new Conta(id, nome, valor));
        System.out.println("Deseja continuar");
        resp = sc.next();
        if(!resp.equalsIgnoreCase("sim")){
            break;
            }
        }
        System.out.print("----------------");

        for (Conta x: contas) {
            System.out.println(x);
        }

        sc.close();
    }
}
