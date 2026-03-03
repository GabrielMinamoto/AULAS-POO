package AULA03;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Random r = new Random();
        contaBanco c = new contaBanco();
        DecimalFormat fMoeda = new DecimalFormat("#,##0.00");
        double valor;

        System.out.print("Nome do correntista ---> ");
        c.nome=e.next();

        c.numero=r.nextInt(1000,9000);

        System.out.println(("Seu saldo --> ") + c.saldo);

        //pedindo valor de deposito
        System.out.println(("Digite o valor de deposito --> "));
        valor = e.nextDouble();
        c.deposito(valor);

        System.out.println(("Seu saldo atual --->") + fMoeda.format(c.saldo));

        System.out.println(("Digite o valor de saque --> "));
        valor = e.nextDouble();
        c.sacar(valor);

        System.out.println(("Seu saldo atual ---> ") + c.saldo);


    }
}
