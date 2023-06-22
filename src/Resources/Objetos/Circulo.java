package Resources.Objetos;

import java.util.Scanner;

import Resources.Figuras;
import Resources.Points;

public class Circulo extends Figuras{

    Points punto1 = listaPuntos.get(0);
    Points punto2 = listaPuntos.get(1);

    double radio;

    @Override
    public double figuraPerimetro() {
        double perimetro;

        radio = obtenerDistancias(punto1, punto2);

        perimetro = Math.PI * Math.pow(radio, 2);

        return perimetro;

    }

    @Override
    public double figuraArea() { 
        double area;

        area = 2 * Math.PI * radio;

        return area;

    }

    @Override
        public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la componente X del punto 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 1: ");
        double y1 = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto 1: ");
        double z1 = sc.nextDouble();
        listaPuntos.add (new Points(x1, y1, z1));

    }
}
