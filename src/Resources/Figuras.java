package Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figuras {

    public List<Points> listaPuntos = new ArrayList<>();

    
    public abstract double figuraPerimetro();
    
    public abstract double figuraArea();

    
    public double obtenerDistancias(Points punto1, Points punto2){

        double d;
        d = Math.sqrt(Math.pow((punto1.getX() - punto2.getX()),2) + 
                    Math.pow((punto1.getY() - punto2.getY()),2) +
                    Math.pow((punto1.getZ() - punto2.getZ()),2));

        return d;
    }

    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la componente X del punto 1: ");
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 1: ");
        double y = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto 1: ");
        double z = sc.nextDouble();
        listaPuntos.add (new Points(x, y, z));
        }
}
