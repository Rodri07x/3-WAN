package evalu2sprint1;

public class Productos {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
    
    // constructor
    public Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void actualizarStock(int cantidad) {
        this.stock = cantidad;
    }

    public void modificarPrecio(double precio) {
        this.precio = precio;
    }

    // getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}