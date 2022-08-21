
public class  Triangulo extends Figura {
private double lado;
private double altura;

    public Triangulo(String color, double lado, double altura) {
        super(color);
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area;
        area =(lado*altura)/2;
        return area;
    }
}
