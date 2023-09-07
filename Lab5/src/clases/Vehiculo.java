package clases;

/**
 *
 * @author PGC
 */
public class Vehiculo {

    private String patente;
    private int año;
    public final int VALOR_DIARIO = 10000;
    public final float IVA = 0.19f;

    public Vehiculo() {
    }

    public Vehiculo(String patente, int año) {
        this.patente = patente;
        this.año = año;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año <= 2023) {
            this.año = año;
        }else{
            //Lanzar excepción (contenido aún no revisado)
        }

    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", a\u00f1o=" + año + '}';
    }

    public float getValorDiario() {
        return VALOR_DIARIO + VALOR_DIARIO * IVA;
    }

}
