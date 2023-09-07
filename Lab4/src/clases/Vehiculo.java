
package clases;

public class Vehiculo {
    private String patente;
    private int año;
    public int VALOR_DIARIO = 10000;
    public float IVA = (float) 0.19;

    public Vehiculo() {
    }

    public Vehiculo(String patente, int año) {
        this.patente = patente;
        this.año = año;
    }
    
    public String getPatente() {
        return patente;
    }

    public int getAño() {
        return año;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setAño(int año) {
        if(año < 2023)
        this.año = año;
        else{
            System.out.println("Error");
        }
    }
   
    @Override
    public String toString(){
        return "\nVehiculo \nPatente: " + this.patente +
                "\nAño: " + this.año;
    }
     public float getValorDiario(){
        return VALOR_DIARIO;
    }
    
}
