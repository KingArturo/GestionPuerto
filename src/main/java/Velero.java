public class Velero extends Barco {

    private int numMastiles;

    public Velero(String matricula, double eslora, int anoFabric, Persona propietario, int numMastiles) {
        super(matricula, eslora, anoFabric, propietario);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Velero ";
        aDevolver += super.toString();
        aDevolver += " numero de Mastiles " + numMastiles;
        return aDevolver;
    }

    /**
     * Metodo que devuelve un número entero con
     * el resultado de la suma del número de camarotes y
     * el de la potencia.
     * @return
     */
    @Override
    public int calcularBernua() {
        return numMastiles;
    }
}
