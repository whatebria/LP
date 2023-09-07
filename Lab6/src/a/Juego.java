
package a;

public abstract class Juego {
    
    private String nombre;
    private String descripcion;
    private String reglas;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, String reglas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.reglas = reglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getReglas() {
        return reglas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }
    
    
    public abstract void jugar();
}
