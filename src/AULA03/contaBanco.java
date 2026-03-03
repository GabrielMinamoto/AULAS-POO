package AULA03;

public class contaBanco {
    //atributos
    String nome;
    int numero;
    double saldo;

    //metodo para depositar valor
    //evitar fazer scanner dentro de metodos, focar em montar o mais generico possivel
    public void deposito(double valor){

        saldo += valor;
    }

    //metodo para sacar valor
    public void sacar(double valor){
        saldo -= valor;
    }
}
