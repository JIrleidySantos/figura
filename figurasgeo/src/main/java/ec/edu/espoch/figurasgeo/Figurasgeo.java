/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.figurasgeo;

import ec.edu.espoch.figurasgeo.PartJir.Circulo;
import ec.edu.espoch.figurasgeo.PartJir.Cuadrado;

/**
 *
 * @author mundo
 */
public class Figurasgeo {

    public static void main(String[] args) {

        Circulo objCirculo = new Circulo(10.6);

        objCirculo.imprimir();

        double area = objCirculo.calcularArea();
        System.out.println("El Area del circulo es: " + area);

        double perimetro = objCirculo.calcularPerimetro();
        System.out.println("El perimetro del Circulo es " + perimetro);

        Cuadrado objCuadrado = new Cuadrado(30.5);

        objCuadrado.imprimir();

        double areaC = objCuadrado.calcularArea();
        System.out.println("El Area del cuadrado es: " + areaC);

        double perimetroC = objCuadrado.calcularPerimetro();
        System.out.println("El perimetro del Cuadrado es: " + perimetroC);

    }
}
