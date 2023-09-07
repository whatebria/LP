
package clases;


public class Automovil extends Vehiculo {
    private boolean deLujo;

    public Automovil() {
    }

    public Automovil(boolean deLujo, String patente, int año) {
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
    public float getValorDiario(){
        if(this.deLujo == true){
            return (super.VALOR_DIARIO *= 3)+(VALOR_DIARIO * IVA);
        }
        else{
            return (super.VALOR_DIARIO) + (VALOR_DIARIO * IVA);
        }
    }

    @Override
    public String toString(){
        String tipo;
        if(deLujo == true){
            tipo = " de lujo";
        }
        else{
            tipo = " comun";
        }
        return "\nAutomovil " + tipo + "\nValor diario: " + this.getValorDiario();
    }
    
}
