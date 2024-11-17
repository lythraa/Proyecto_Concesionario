package co.edu.uniquindio.poo.model;

public class Bus extends Carro {
    private int númeroDeEjes;
    private int númeroDeSalidasDeEmergencia;

    

    public Bus(String matricula, String marca, String modelo, boolean esNuevo, int numeroCambios,
            double velocidadMaxima, String cilindraje, double precio, double precioDia, boolean disponibilidad,
            Transmision transmision, Combustible combustible, int numeroDePasajeros, int númeroDePuertas,
            double capacidadDelMaletero, boolean tieneAireAcondicionado, boolean tieneCámaraDeReversa,
            int númeroDeBolsasDeAire, boolean tieneABS, int númeroDeEjes, int númeroDeSalidasDeEmergencia) {
        super(matricula, marca, modelo, esNuevo, numeroCambios, velocidadMaxima, cilindraje, precio, precioDia,
                disponibilidad, transmision, combustible, numeroDePasajeros, númeroDePuertas, capacidadDelMaletero,
                tieneAireAcondicionado, tieneCámaraDeReversa, númeroDeBolsasDeAire, tieneABS);
        this.númeroDeEjes = númeroDeEjes;
        this.númeroDeSalidasDeEmergencia = númeroDeSalidasDeEmergencia;
    }

    public int getNúmeroDeEjes() {
        return númeroDeEjes;
    }

    public void setNúmeroDeEjes(int númeroDeEjes) {
        this.númeroDeEjes = númeroDeEjes;
    }

    public int getNúmeroDeSalidasDeEmergencia() {
        return númeroDeSalidasDeEmergencia;
    }

    public void setNúmeroDeSalidasDeEmergencia(int númeroDeSalidasDeEmergencia) {
        this.númeroDeSalidasDeEmergencia = númeroDeSalidasDeEmergencia;
    }

}