package exercicio02;

public class Triangulo {
    private double base;
    private double altura;



    //Métodos
    public void calculoDeArea(){
        double area = (this.base * this.altura) / 2;
        System.out.println("A area do triangulo é: " + area);
    }

    //Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Get e Set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
