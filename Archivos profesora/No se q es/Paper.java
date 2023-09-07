
package clases;

public class Paper extends Publicacion {
    private String editor;
    private String edicion;

    public Paper() {
    }

    public Paper(String editor, String edicion, String titulo, int año, Autor autor, Estado estado) {
        super(titulo, año, autor, estado);
        this.editor = editor;
        this.edicion = edicion;
    }

    public String getEditor() {
        return editor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    @Override
    public String toString(){
        return "\nPaper: \n" + getAutor().getApellido() + ", " +
                getAutor().getNombre().charAt(0) + "\n" +
                this.getTitulo() + "\n" + this.edicion + ", "+
                this.editor + "\n" + super.getEstado();
                }
}
