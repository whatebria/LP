package clases;

/**
 *
 * @author PGC
 */
public class Automovil extends Vehiculo {

    private boolean deLujo;

    public Automovil() {
    }

    public Automovil(String patente, int año, boolean deLujo) {
        super(patente, año);
        this.deLujo = deLujo;
    }

    public boolean isDeLujo() {
        return deLujo;
    }

    public void setDeLujo(boolean deLujo) {
        this.deLujo = deLujo;
    }

    @Override
    public float getValorDiario() {
        if (deLujo) {
            return super.getValorDiario() * 3;
        } else {
            return super.getValorDiario();
        }
    }

    @Override
    public String toString() {
        String tipo = (deLujo) ? "de lujo" : "comun";
        return this.getPatente()+ " Automovil " + tipo + "\n $" +  (int)this.getValorDiario();

    }

}
