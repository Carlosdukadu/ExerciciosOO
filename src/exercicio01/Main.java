package exercicio01;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra1 = new Guitarra("Vermelha", "Ibanez", 6);
        Guitarra guitarra2 = new Guitarra("Azul", "Tagima", 7);
        Guitarra guitarra3 = new Guitarra("Verde", "GB", 6);

guitarra1.trocarPara7Cordas(6);
guitarra2.trocarPara7Cordas(7);

guitarra3.informações();

    }
}
