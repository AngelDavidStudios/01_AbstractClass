package Resources.Objetos;

import java.util.Scanner;

import Resources.Figuras;
import Resources.Points;

public class Cuadrado extends Figuras {

    Points punto1 = listaPuntos.get(0);
    Points punto2 = listaPuntos.get(1);
    Points punto3 = listaPuntos.get(2);
    Points punto4 = listaPuntos.get(3);

    double l1;
    double l2;
    double l3;
    double l4;

    @Override
    public double figuraPerimetro() {
        double perimetro;

        l1 = obtenerDistancias(punto1, punto2);
        l2 = obtenerDistancias(punto2, punto4);
        l3 = obtenerDistancias(punto3, punto4);
        l4 = obtenerDistancias(punto1, punto3);

        perimetro = l1 + l2 + l3 + l4;

        return perimetro;

    }

    @Override
    public double figuraArea() { 
        double area;

        area = Math.pow(l1, 2);

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

        System.out.println("Ingrese la componente X del punto 2: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 2: ");
        double y2 = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto 2: ");
        double z2 = sc.nextDouble();
        listaPuntos.add (new Points(x2, y2, z2));

        System.out.println("Ingrese la componente X del punto 3: ");
        double x3 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 3: ");
        double y3 = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto 3: ");
        double z3 = sc.nextDouble();
        listaPuntos.add (new Points(x3, y3, z3));

        System.out.println("Ingrese la componente X del punto 3: ");
        double x4 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 3: ");
        double y4 = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto 3: ");
        double z4 = sc.nextDouble();
        listaPuntos.add (new Points(x4, y4, z4));
        }
    
}
