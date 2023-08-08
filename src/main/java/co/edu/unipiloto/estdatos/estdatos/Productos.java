/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.estdatos;

/**
 *
 * @author SG702-07
 */
public enum Productos {
    JABON("Ariel", 4000,"ASEO"),
    PAPAS("SuperRicas", 2500,"ALIMENTOS"),
    YOGURT("Alpina", 3000,"BEBIDAS"),
    ARROZ("Diana", 2500,"ALIMENTOS"),
    ACEITE("Palma", 6000,"AIMENTOS"),
    DULCES("BomBomBum", 600,"ALIMENTOS"),
    PAN("Bimbo", 7000,"ALIMENTOS"),
    CAFE("JuanValdez", 150000,"ALIMENTOS"),
    GASEOSA("Pepsi",6000,"BEBIDAS"),
    CREMADEDIENTES("Colgate",5000,"ASEO");
    
    

    String marca;
    int precio;
    private String categoria;

    private Productos(String marca, int precio,String categoria) {
        this.marca = marca;
        this.precio = precio;
        this.categoria= categoria;
    }
    public static void imprimirProductosPorCategoria(String categoria) {
        for (Productos producto : Productos.values()) {
            if (producto.categoria.equals(categoria)) {
                System.out.println(producto);
            }
            
                } 
            }
    public static int sumarPrecios() {
        int total = 0;
        for (Productos producto : Productos.values()) {
            total += producto.precio;
        }
        return total;
    }
    public static int sumarPreciosCategoria(String categoria) {
        int totalCategoria = 0;
        for (Productos producto : Productos.values()) {
            if (producto.categoria.equals(categoria)) {
                totalCategoria += producto.precio;
            }
        }
        return totalCategoria;
    }

    @Override
    public String toString() {
        return "Producto: " + name() +
               ", Marca: " + marca +
               ", Precio: " + precio +
               ", Categoría: " + categoria;
    }

   
}
