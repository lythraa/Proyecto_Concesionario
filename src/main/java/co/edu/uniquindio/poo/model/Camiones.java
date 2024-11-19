package co.edu.uniquindio.poo.model;

public class Camiones extends Carro {
    private int numeroCaballosDeFuerza;
    private double tiempoParaAlcanzar100KmH;

    public Camiones(String matricula, String marca, String modelo, boolean esNuevo, int numeroCambios,
            double velocidadMaxima, String cilindraje, double precio, double precioDia, boolean disponibilidad,
            Transmision transmision, Combustible combustible, int numeroDePasajeros, int númeroDePuertas,
            double capacidadDelMaletero, boolean tieneAireAcondicionado, boolean tieneCámaraDeReversa,
            int númeroDeBolsasDeAire, boolean tieneABS, int numeroCaballosDeFuerza, double tiempoParaAlcanzar100KmH) {
        super(matricula, marca, modelo, esNuevo, numeroCambios, velocidadMaxima, cilindraje, precio, precioDia,
                disponibilidad, transmision, combustible, numeroDePasajeros, númeroDePuertas, capacidadDelMaletero,
                tieneAireAcondicionado, tieneCámaraDeReversa, númeroDeBolsasDeAire, tieneABS);
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
    }

    public int getNumeroCaballosDeFuerza() {
        return numeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(int numeroCaballosDeFuerza) {
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getTiempoParaAlcanzar100KmH() {
        return tiempoParaAlcanzar100KmH;
    }

    public void setTiempoParaAlcanzar100KmH(double tiempoParaAlcanzar100KmH) {
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
    }
}