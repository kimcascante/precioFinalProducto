package Semana2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej2w2 {
    /**
 * Nombre del programa: Ejercicio 2 Semana 2
 * Descripcion: Calcular el precio final de cualquier producto, si se sabe que la tasa de impuesto al 
    valor agregado es de un 13 %. El algoritmo debe recibir el nombre del producto y el precio,
    y debe imprimir el nombre del producto y el precio final. Para los efectos del ejercicio,
    TODOS los productos pagan impuesto. 
 * Autor: Kimberly C.
 * Fecha de creacion: 9-6-2020
 * Modificado por:
 * fecha de modificacion:
 */

public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
public static PrintStream escribir = System.out;

public static void main(String[] args) throws IOException{
    
    String nombreProducto;
    double tasaImpuesto;
    double precioProducto;
    double precioProductoFinal;

    tasaImpuesto = 0.13;

    escribir.println("Digite el nombre del producto");
    nombreProducto = leer.readLine();

    escribir.println("Digite el precio del producto");
    precioProducto = Double.parseDouble(leer.readLine());

    precioProductoFinal = precioProducto + (precioProducto * tasaImpuesto);

    escribir.print("El producto " + nombreProducto + " tiene como precio final " + precioProductoFinal);

    }
}