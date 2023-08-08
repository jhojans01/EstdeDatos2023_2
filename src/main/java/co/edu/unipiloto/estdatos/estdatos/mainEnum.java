/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unipiloto.estdatos.estdatos;

import java.util.Scanner;

/**
 *
 * @author SG702-07
 */
public class mainEnum {

     public static void main(String[] args) {
        Productos[] productos = Productos.values();
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
 Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa los productos que deseas llevar (separados por comas): ");
        String productosSeleccionados = scanner.nextLine();

        String[] productosElegidos = productosSeleccionados.split(",");
        int totalPrecio = 0;
        StringBuilder productosElegidosInfo = new StringBuilder();

        for (String productoElegido : productosElegidos) {
            for (Productos producto : Productos.values()) {
                if (productoElegido.trim().equalsIgnoreCase(producto.name())) {
                    totalPrecio += producto.precio;
                    productosElegidosInfo.append(producto).append("\n");
                    break;
                }
            }
        }

        System.out.println("\nProductos seleccionados:\n" + productosElegidosInfo);
        System.out.println("Total a pagar: " + totalPrecio);
    }
}
