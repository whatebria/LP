
package negocio;

public class Servicio {
    
    private String fechaRegistro;
    private String nombre;
    private Categoria Categoria;
    private int costo;

    public Servicio() {
    }

    public Servicio(String fechaRegistro, String nombre, Categoria Categoria, int costo) {
        this.fechaRegistro = fechaRegistro;
        this.nombre = nombre;
        this.Categoria = Categoria;
        this.costo = costo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public int getCosto() {
        return costo;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "Nombre servicio: " + nombre +
                "\nCosto mensual: " + costo + 
                "\nFecha de registro: " + this.fechaRegistro + 
                "\nCategoria: " + this.Categoria ;
    }
    
}
