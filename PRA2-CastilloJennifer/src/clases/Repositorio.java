
package clases;

import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Repositorio() {
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public void add(Publicacion publicacion){
        publicaciones.add(publicacion);
    }
    
    public ArrayList<Publicacion> getPublicaciones(){
        return publicaciones;
    }
    
    public ArrayList<Publicacion> getPublicacionensByEstado(Estado estado){
        ArrayList<Publicacion> lista = new ArrayList<>();
        for(int i = 0; i < publicaciones.size(); i++){
            if(this.publicaciones.get(i).getEstado() == estado){
                lista.add(publicaciones.get(i));
            }
        }
        return lista;
    }
    public ArrayList<Publicacion> getPublicacionensByAño(int año){
        ArrayList<Publicacion> lista = new ArrayList<>();
        for(int i  = 0; i<publicaciones.size(); i++){
            if(this.publicaciones.get(i).getAño() == año){
                lista.add(publicaciones.get(i));
            }
        }
        return lista;
    }
}
