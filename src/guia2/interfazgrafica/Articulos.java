
package guia2.interfazgrafica;

/**
 *
 * @author Dario
 */

public class Articulos implements Comparable<Articulos>{
    private int codigo;
    private String descripcion;
    private double precio;
    private double stock;
    private Categorias rubro;

    public Articulos(int codigo, String descripcion, double precio, double stock, Categorias rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Articulos o) {
        if (codigo == o.codigo){
            return 0;
        }else if (codigo > o.codigo){
            return 1;
        }else{
            return -1;
        }
            
    }
    
    
    
}
