package co.edu.uniquindio.poo.model;

public interface Autenticable {

    public boolean verificarCredenciales(String s, String c);

    public String recuperarContraseña(String s);

}
