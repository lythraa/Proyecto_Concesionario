package co.edu.uniquindio.poo.controllers;

public class Sesion {
    public static enum Rol{
        ADMIN, 
        EMPLEADO
    }
    private static Rol rolActual;

    public static void setRol(Rol rol) {
        rolActual = rol;
    }

    public static Rol getRol() {
        return rolActual;
    }
}
