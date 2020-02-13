package exercicio01;

import java.sql.SQLOutput;

public class Guitarra {
    private String cor;
    private String marca;
    private int quantidadeCordas;




    //Método
    public void informações(){
        System.out.println("Especifiçaões: ");
        System.out.println("Cor da guitarra: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cordas: " + this.quantidadeCordas);
    }

    public void trocarPara7Cordas(int valor){
        if (valor != 7) {
            this.quantidadeCordas = this.quantidadeCordas + 1;
            System.out.println("Upgrade realizado com sucesso!");
        } else {
            System.out.println("Essa guitarra ja tem 7 cordas, troca não realizada.");
        }
    }


    //Construtor
    public Guitarra(String cor, String marca, int quantidadeCordas) {
        this.cor = cor;
        this.marca = marca;
        this.quantidadeCordas = quantidadeCordas;
    }

    //Get e Set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }

    public void setQuantidadeCordas(int quantidadeCordas) {
        this.quantidadeCordas = quantidadeCordas;
    }
}
