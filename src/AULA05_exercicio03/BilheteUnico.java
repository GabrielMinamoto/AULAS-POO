package AULA05_exercicio03;

import java.util.Random;

public class BilheteUnico {

    int  numBilhete;
    String nome;
    double saldo;
    final static double tarifaBase = 5.40;
    char tipoTarifa;


    public BilheteUnico(String nome, char tipoTarifa){
        Random r = new Random();
        this.nome = nome;
        this.numBilhete = r.nextInt(1000,9999);
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
    }

    public void carregar(double valor){
        if (valor <= 0){
            return;
        }
        this.saldo += valor;
    }

    public void passagemCatraca(){
        if ((tipoTarifa == 'E' || tipoTarifa == 'P')){
            saldo-=tarifaBase/2;

        } else if (tipoTarifa == 'N') {
            saldo-=tarifaBase;

        }else {
            System.out.println("Escolha uma tarifa correta, (E) estudante, (P) professor e (N) normal: ");
        }

        if (saldo > tarifaBase/2){
            System.out.println("Passou! " + saldo);
        }else{
            System.out.println("Não passou! " + saldo);
        }
    }
}
