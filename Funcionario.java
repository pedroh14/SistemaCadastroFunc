package codigo2;
import codigo2.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplicaçao  {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    List<funcionario>lista = new ArrayList<>();

    System.out.print("quantos funcionarios deseja cadastrar: " );
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++){
        System.out.println("Insira dados abaixo: ");
        System.out.print("funcionario Terceirizado(S/N): ");
        char decisao = sc.next().charAt(0);
        System.out.print("Informe nome: ");
        String nome = sc.nextLine();
        sc.next();
        System.out.print("Insira quantidade de horas: ");
        int horas = sc.nextInt();
        System.out.print("Insira valor da hora: ");
        double valor_hora = sc.nextDouble();

        if(decisao == 'S'){
            System.out.print("bonus adicional: ");
            double adicional = sc.nextDouble();
            funcionario fun = new funcionariotemp(nome,horas,valor_hora,adicional);
            lista.add(fun);
        }
        else{
            funcionario fun = new funcionario(nome,horas,valor_hora);
            lista.add(fun);
        }
    }
        System.out.println();
        for(funcionario na: lista){
            System.out.print("\n Nome: "+na.getNome() +" - " + String.format(" pagamento: %.2f ",na.pagamento()));

        }

    }
}
