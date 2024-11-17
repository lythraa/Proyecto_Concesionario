package co.edu.uniquindio.poo.model;

public class Sedan extends Carro {
    private boolean tieneVelocidadDeCrucero;
    private boolean tieneSensoresDeColision;
    private boolean tieneSensorDeTráficoCruzado;
    private boolean tieneAsistenteDePermanenciaEnElCarril;

    

    public Sedan(String matricula, String marca, String modelo, boolean esNuevo, int numeroCambios,
            double velocidadMaxima, String cilindraje, double precio, double precioDia, boolean disponibilidad,
            Transmision transmision, Combustible combustible, int numeroDePasajeros, int númeroDePuertas,
            double capacidadDelMaletero, boolean tieneAireAcondicionado, boolean tieneCámaraDeReversa,
            int númeroDeBolsasDeAire, boolean tieneABS, boolean tieneVelocidadDeCrucero,
            boolean tieneSensoresDeColision, boolean tieneSensorDeTráficoCruzado,
            boolean tieneAsistenteDePermanenciaEnElCarril) {
        super(matricula, marca, modelo, esNuevo, numeroCambios, velocidadMaxima, cilindraje, precio, precioDia,
                disponibilidad, transmision, combustible, numeroDePasajeros, númeroDePuertas, capacidadDelMaletero,
                tieneAireAcondicionado, tieneCámaraDeReversa, númeroDeBolsasDeAire, tieneABS);
        this.tieneVelocidadDeCrucero = tieneVelocidadDeCrucero;
        this.tieneSensoresDeColision = tieneSensoresDeColision;
        this.tieneSensorDeTráficoCruzado = tieneSensorDeTráficoCruzado;
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
    }

    public boolean isTieneVelocidadDeCrucero() {
        return tieneVelocidadDeCrucero;
    }

    public void setTieneVelocidadDeCrucero(boolean tieneVelocidadDeCrucero) {
        this.tieneVelocidadDeCrucero = tieneVelocidadDeCrucero;
    }

    public boolean isTieneSensoresDeColision() {
        return tieneSensoresDeColision;
    }

    public void setTieneSensoresDeColision(boolean tieneSensoresDeColision) {
        this.tieneSensoresDeColision = tieneSensoresDeColision;
    }

    public boolean isTieneSensorDeTráficoCruzado() {
        return tieneSensorDeTráficoCruzado;
    }

    public void setTieneSensorDeTráficoCruzado(boolean tieneSensorDeTráficoCruzado) {
        this.tieneSensorDeTráficoCruzado = tieneSensorDeTráficoCruzado;
    }

    public boolean isTieneAsistenteDePermanenciaEnElCarril() {
        return tieneAsistenteDePermanenciaEnElCarril;
    }

    public void setTieneAsistenteDePermanenciaEnElCarril(boolean tieneAsistenteDePermanenciaEnElCarril) {
        this.tieneAsistenteDePermanenciaEnElCarril = tieneAsistenteDePermanenciaEnElCarril;
    }

}
