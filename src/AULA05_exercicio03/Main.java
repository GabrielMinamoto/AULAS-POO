package AULA05_exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BilheteUnico b = new BilheteUnico("Amorim", 'E');

        b.carregar(2);
        b.passagemCatraca();
    }
}
