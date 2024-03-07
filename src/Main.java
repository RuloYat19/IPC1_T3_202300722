import java.util.ArrayList;
import java.util.List;

// Clase abstracta Figura
abstract class Figura {
    protected int numeroLados;

    // Wea del constructor
    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Método abstracto pa calcular el área
    public abstract double calcularArea();
}

// Subclase del cuadrado
class Cuadrado extends Figura {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    // Método pal area del cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Subclase del triangulo
class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    // Método pal área del triangulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Subclase del circulo
class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        super(0);
        this.radio = radio;
    }

    // Método pal área del circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5));
        figuras.add(new Triangulo(4, 3));
        figuras.add(new Circulo(2));

        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            System.out.println("Figura: " + nombreFigura + ", Área: " + area);
        }
    }
}

