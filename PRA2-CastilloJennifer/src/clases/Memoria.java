
package clases;

public class Memoria extends Publicacion {
    private String carrera;

    public Memoria() {
    }

    public Memoria(String titulo, int año, Autor autor, Estado estado, String carrera) {
        super(titulo, año, autor, estado);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString(){
        return "\n" + getTitulo() + "\n" + getAutor().getApellido()
                + ", " + getAutor().getNombre() + ". " + getAño() + "\n" 
                + this.carrera + "\n" + getEstado();
    }
}
