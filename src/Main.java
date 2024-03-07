import java.util.ArrayList;
import java.util.List;

// Clase abstracta Figura
abstract class Figura {
    protected int numeroLados;

    // Constructor
    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Subclase Cuadrado
class Cuadrado extends Figura {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        super(4); // Cuadrado tiene 4 lados
        this.lado = lado;
    }

    // Implementación del método calcularArea para el cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Subclase Triangulo
class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        super(3); // Triángulo tiene 3 lados
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea para el triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Subclase Circulo
class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        super(0); // Circulo no tiene lados, pero usaremos 0 por simplicidad
        this.radio = radio;
    }

    // Implementación del método calcularArea para el círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear una lista de Figura y agregar instancias de las subclases
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5));
        figuras.add(new Triangulo(4, 3));
        figuras.add(new Circulo(2));

        // Imprimir el nombre de la figura junto al área calculada
        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            System.out.println("Figura: " + nombreFigura + ", Área: " + area);
        }
    }
}

