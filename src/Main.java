import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color;
        double lado;
        double altura;
        double lado1;
        Scanner x = new Scanner(System.in);
        System.out.println("ingrese el color");
        color=x.next();
        System.out.println("ingrese el lado del cuadrado");
        lado=x.nextDouble();
        Cuadrado c1 = new Cuadrado(color,lado);
        System.out.println("el area del cuadrado es "+c1.calcularArea());
        System.out.println("el color de cuadrado es "+c1.getColor());
        System.out.println("ingrese el color del triangulo");
        color=x.next();
        System.out.println("ingrese la altura del triangulo");
        lado1=x.nextDouble();
        System.out.println("ingrese el base del triangulo");
        altura=x.nextDouble();
        Triangulo t = new Triangulo(color,lado1,altura);
        System.out.println("el area del triangulo es "+t.calcularArea());
    }


}
