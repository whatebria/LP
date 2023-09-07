
import clases.Autor;
import clases.Estado;
import clases.Memoria;
import clases.Paper;
import clases.Publicacion;
import clases.Repositorio;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {

        Repositorio registro = new Repositorio();
        ArrayList<Publicacion> lista = new ArrayList();
        
        Autor autor1 = new Autor("Francisco", "Vera");
        Autor autor2 = new Autor("Alejandro", "Fuentes");
        Autor autor3 = new Autor("Carolina", "Aliaga");
        Autor autor4 = new Autor("Andrea", "Riquelme");
        Autor autor5 = new Autor("Rodrigo", "Alegria");
        Memoria memoria1 =  new Memoria("SISTEMA DE GESTION EDUCATIVA", 2023, autor1, Estado.Publicada, "Ingenieria en infromatica");
        Paper paper1 = new Paper("MODELO DE PLANIFICACION DE CAMBIOS", 2021, autor2, Estado.Pendiente, "Revista centro de informacion tecnologica", "Abril 2022");
        Memoria memoria2 = new Memoria("PROPUESTA DE IMPLEMENTACION DE WEB SERVER LOCAL", 2022, autor3, Estado.Autorizada, "Ingenieria en informatica");
        Paper paper2 = new Paper("MODELO DE EVALUACION POR COMPETENCIAS", 2023, autor4, Estado.Autorizada, "Revista perspeciva editorial", "Marzo 2023");
        Memoria memoria3 = new Memoria("SISTEMA DE CONTROL DE STOCK", 2023, autor5, Estado.Publicada, "Tecnico universitario en informatica");
        
        registro.add(memoria1);
        registro.add(paper1);
        registro.add(memoria2);
        registro.add(paper2);
        registro.add(memoria3);
        
        System.out.println("PUBLICACIONES:");
        lista = registro.getPublicaciones();
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("-----------------------");
        
        System.out.println("AUN NO PULICADAS");
        lista = registro.getPublicacionensByEstado(Estado.Autorizada);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        lista = registro.getPublicacionensByEstado(Estado.Pendiente);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("-----------------------");
        
        System.out.println("PUBLICACIONES AÑO 2023");
        lista = registro.getPublicacionensByAño(2023);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("-----------------------");
    }
}
