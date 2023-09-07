
package clases;

public class Publicacion {
    private String titulo;
    private  int año;
    private Autor autor;
    private Estado estado;

    public Publicacion() {
    }

    public Publicacion(String titulo, int año, Autor autor, Estado estado) {
        this.titulo = titulo;
        this.año = año;
        this.autor = autor;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public Autor getAutor() {
        return autor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
