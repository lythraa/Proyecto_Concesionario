package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Concesionario {

    private static Concesionario instancia;

    private String nombre;
    private LinkedList<Empleado> listaEmpleados;
    private LinkedList<Cliente> listaClientes;
    private LinkedList<Vehiculo> listaVehiculos;
    private LinkedList<Reporte> listaReportes;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new LinkedList<Empleado>();
        this.listaClientes = new LinkedList<Cliente>();
        this.listaVehiculos = new LinkedList<Vehiculo>();
        this.listaReportes = new LinkedList<Reporte>();
    }

    public LinkedList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public LinkedList<Reporte> getListaTransacciones() {
        return listaReportes;
    }

    public void setListaTransacciones(LinkedList<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Reporte> getListaReportes() {
        return listaReportes;
    }

    public void setListaReportes(LinkedList<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }
    
    public static Concesionario getInstancia() {
        if (instancia == null) {
            instancia = new Concesionario("Concesionario UQ");
        }
        return instancia;
    }

    // CRUDSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS

    

    
    // CRUD Empleado

    /**
     * Añadir Empleado
     * 
     * @param empleado
     * @return
     * @throws IllegalArgumentException
     */
    public String añadirEmpleado(Empleado empleado) throws IllegalArgumentException {
        String mensaje = "Se añadió correctamente";
        if (empleado == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        listaEmpleados.add(empleado);
        return mensaje;
    }

    /**
     * Eliminar Empleado
     * 
     * @param empleado
     * @return
     * @throws IllegalArgumentException
     */
    public String eliminarEmpleado(Empleado empleado) throws IllegalArgumentException {
        String mensaje = "Se eliminó correctamente";
        if (empleado == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        if (!listaEmpleados.contains(empleado)) {
            mensaje = "No se encuentra en la lista";
        }
        listaEmpleados.remove(empleado);
        return mensaje;
    }

    /**
     * Buscar Empleado por id
     * 
     * @param id
     * @return
     */
    public Empleado buscarEmpleado(String id) {
        return listaEmpleados.stream()
                .filter(empleadoAux -> empleadoAux.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Editar empleado, borra uno y añade el nuevo
     * 
     * @param empleado
     * @param nuevoEmpleado
     * @return
     * @throws IllegalArgumentException
     */
    public String editarEmpleado(Empleado empleado, Empleado nuevoEmpleado) throws IllegalArgumentException {
        String mensaje = "Editado correctamente";

        if (empleado == null || nuevoEmpleado == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }

        if (!listaEmpleados.contains(empleado)) {
            mensaje = "No se encuentra en la lista";
        }

        listaEmpleados.remove(empleado);
        listaEmpleados.add(nuevoEmpleado);
        return mensaje;
    }


    /**
     * Verfica que el empleado esté activo y sus credenciales sean correctas
     * @param s
     * @param c
     * @return
     */
    public Empleado verificarCredenciales(String s, String c) {
        for (Empleado empleado : listaEmpleados) {
            if (s.equals(empleado.getUsuario()) && c.equals(empleado.getContraseña()) && empleado.isActivo()) {
                return empleado;
            }
            
        }
        return null;    
    }
}