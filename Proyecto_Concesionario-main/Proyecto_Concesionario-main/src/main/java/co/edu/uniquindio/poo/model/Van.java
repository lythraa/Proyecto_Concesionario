package co.edu.uniquindio.poo.model;

public class Van extends Carro {

    private boolean esLinda;

    
    public Van(String matricula, String marca, String modelo, boolean esNuevo, int numeroCambios,
            double velocidadMaxima, String cilindraje, double precio, double precioDia, boolean disponibilidad,
            Transmision transmision, Combustible combustible, int numeroDePasajeros, int númeroDePuertas,
            double capacidadDelMaletero, boolean tieneAireAcondicionado, boolean tieneCámaraDeReversa,
            int númeroDeBolsasDeAire, boolean tieneABS, boolean esLinda) {
        super(matricula, marca, modelo, esNuevo, numeroCambios, velocidadMaxima, cilindraje, precio, precioDia,
                disponibilidad, transmision, combustible, numeroDePasajeros, númeroDePuertas, capacidadDelMaletero,
                tieneAireAcondicionado, tieneCámaraDeReversa, númeroDeBolsasDeAire, tieneABS);
        this.esLinda = esLinda;
    }

    public boolean isEsLinda() {
        return esLinda;
    }

    public void setEsLinda(boolean esLinda) {
        this.esLinda = esLinda;
    }

}