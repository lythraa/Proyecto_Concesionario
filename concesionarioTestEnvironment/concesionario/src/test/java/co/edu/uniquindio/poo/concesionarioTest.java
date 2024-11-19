/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;

/**
 * Unit test for simple App.
 */
public class concesionarioTest {
    private static final Logger LOG = Logger.getLogger(concesionarioTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAñadirEmpleado() {
        LOG.info("Iniciado testAssertEquals añadir empleado");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        assertEquals("Se añadió correctamente", concesionario.añadirEmpleado(empleado1));
        LOG.info("Finalizando testAssertEquals  añadir empleado");
    }

    @Test
    public void testAñadirEmpleadoNulo() {
        LOG.info("Iniciado testAssertEquals añadir empleado nulo");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado2 = new Empleado(null, null, false, null, null, null);
        concesionario.añadirEmpleado(empleado2);
        assertThrows(IllegalArgumentException.class, () -> concesionario.añadirEmpleado(null));
        LOG.info("Finalizando testAssertEquals  añadir empleado nulo");
    }

    @Test
    public void testEliminarEmpleado() {
        LOG.info("Iniciado testAssertEquals añadir empleado");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        assertEquals("Se eliminó correctamente", concesionario.eliminarEmpleado(empleado1));
        LOG.info("Finalizando testAssertEquals  añadir empleado");

    }

    @Test
    public void testEliminarEmpleadoNulo() {
        LOG.info("Iniciado testAssertEquals eliminar empleado nulo");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado2 = new Empleado(null, null, false, null, null, null);
        concesionario.añadirEmpleado(empleado2);
        assertThrows(IllegalArgumentException.class, () -> concesionario.eliminarEmpleado(null));
        LOG.info("Finalizando testAssertEquals eliminar empleado nulo");
    }

    @Test
    public void testBuscarEmpleado() {
        LOG.info("Iniciado testAssertEquals buscar empleado");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        assertEquals(empleado1, concesionario.buscarEmpleado("12345"));
        LOG.info("Finalizando testAssertEquals buscar empleado");
    }

    @Test
    public void testEditarEmpleado() {
        LOG.info("Iniciado testAssertEquals editar empleado");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        Empleado empleadoEditado = new Empleado("5678", "Luis", true, "luis@gmail.com", "789", "contraseña");
        concesionario.añadirEmpleado(empleadoEditado);
        assertEquals("Editado correctamente", concesionario.editarEmpleado(empleado1, empleadoEditado));
        LOG.info("Finalizando testAssertEquals editar empleado");
    }

    // nulo
    @Test
    public void testEditarEmpleadoNulo() {
        LOG.info("Iniciado testAssertEquals editar empleado nulo");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        Empleado empleadoEditado = new Empleado(null, null, false, null, null, null);
        concesionario.añadirEmpleado(empleadoEditado);
        assertThrows(IllegalArgumentException.class, () -> concesionario.editarEmpleado(null, empleadoEditado));
        LOG.info("Finalizando testAssertEquals editar empleado nulo");
    }

    @Test
    public void testEditarEmpleadoLista() {
        LOG.info("Iniciado testAssertEquals editar empleado Lista");
        Concesionario concesionario = new Concesionario("ConcesionarioUq");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        Empleado empleadoEditado = new Empleado("5678", "Luis", true, "luis@gmail.com", "789", "contraseña");
        concesionario.editarEmpleado(empleado1, empleadoEditado);
        assertEquals("No se encuentra en la lista", concesionario.editarEmpleado(empleado1, empleadoEditado));
        LOG.info("Finalizando testAssertEquals editar empleado Lista");
    }

    /////////// TESTS CLIENTES

    @Test
    public void testAñadirCliente() {
        LOG.info("Iniciado testAssertEquals añadir cliente");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        assertEquals("Se añadió correctamente", empleado.añadirCliente(cliente1));
        LOG.info("Finalizando testAssertEquals  añadir cliente");
    }

    @Test
    public void testAñadirClienteNulo() {
        LOG.info("Iniciado testAssertEquals añadir Cliente nulo");
        Cliente cliente1 = new Cliente(null, null, null);
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        assertThrows(IllegalArgumentException.class, () -> empleado.añadirCliente(null));
        LOG.info("Finalizando testAssertEquals  añadir cliente nulo");
    }

    @Test
    public void testEliminarCliente() {
        LOG.info("Iniciado testAssertEquals añadir cliente");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        assertEquals("Se eliminó correctamente", empleado.eliminarCliente(cliente1));
        LOG.info("Finalizando testAssertEquals  añadir cliente");
    }

    @Test
    public void testEliminarClienteNulo() {
        LOG.info("Iniciado testAssertEquals eliminar Cliente nulo");
        Cliente cliente1 = new Cliente(null, null, null);
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        assertThrows(IllegalArgumentException.class, () -> empleado.eliminarCliente(null));
        LOG.info("Finalizando testAssertEquals eliminar cliente nulo");
    }

    @Test
    public void testEliminarClienteLista() {
        LOG.info("Iniciado testAssertEquals eliminar cliente lista");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        assertEquals("No se encuentra en la lista", empleado.eliminarCliente(cliente1));
        LOG.info("Finalizando testAssertEquals eliminar cliente lista");
    }

    @Test
    public void testBuscarCliente() {
        LOG.info("Iniciado testAssertEquals buscar cliente");
        Cliente cliente1 = new Cliente("123", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        assertEquals(cliente1, empleado.buscarCliente("123"));
        LOG.info("Finalizando testAssertEquals buscar cliente");
    }

    @Test
    public void testEditarCliente() {
        LOG.info("Iniciado testAssertEquals editar cliente");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        Cliente clienteEditado = new Cliente("5678", "Miguel", "31131");
        empleado.añadirCliente(clienteEditado);
        assertEquals("editado correctamente", empleado.editarCliente(clienteEditado, cliente1));
        LOG.info("Finalizando testAssertEquals editar cliente");
    }

    @Test
    public void testEditarClienteNulo() {
        LOG.info("Iniciado testAssertEquals editar cliente nulo");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        Cliente clienteEditado = new Cliente("5678", "Miguel", "31131");
        empleado.añadirCliente(clienteEditado);
        assertThrows(IllegalArgumentException.class, () -> empleado.editarCliente(null, cliente1));
        LOG.info("Finalizando testAssertEquals editar cliente nulo");
    }

    @Test
    public void testEditarClienteLista() {
        LOG.info("Iniciado testAssertEquals editar cliente Lista");
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        empleado.añadirCliente(cliente1);
        Cliente clienteEditado = new Cliente("5678", "Miguel", "31131");
        assertEquals("No se encuentra en la lista", empleado.editarCliente(clienteEditado, cliente1));
        LOG.info("Finalizando testAssertEquals editar cliente Lista");
    }

    /////////// TEST VEHICULO

    @Test
    public void testAñadirVehiculo() {
        LOG.info("Iniciado testAssertEquals añadir vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        assertEquals("Se añadió correctamente", empleado.añadirVehiculo(van1));
        LOG.info("Finalizando testAssertEquals añadir vehiculo");
    }

    @Test
    public void testAñadirVehiculoNulo() {
        LOG.info("Iniciado testAssertEquals añadir vehiculo nulo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        assertThrows(IllegalArgumentException.class, () -> empleado.añadirVehiculo(null));
        LOG.info("Finalizando testAssertEquals añadir vehiculo nulo");
    }

    @Test
    public void testEliminarVehiculo() {
        LOG.info("Iniciado testAssertEquals eliminar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertEquals("Se eliminó correctamente", empleado.eliminarVehiculo(van1));
        LOG.info("Finalizando testAssertEquals eliminar vehiculo");
    }

    @Test
    public void testEliminarVehiculoNulo() {
        LOG.info("Iniciado testAssertEquals eliminar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertThrows(IllegalArgumentException.class, () -> empleado.eliminarCliente(null));
        LOG.info("Finalizando testAssertEquals eliminar vehiculo");
    }

    @Test
    public void testEliminarVehiculoNuloLista() {
        LOG.info("Iniciado testAssertEquals eliminar vehiculo lista");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        assertEquals("No se encuentra en la lista", empleado.eliminarVehiculo(van1));
        LOG.info("Finalizando testAssertEquals eliminar vehiculo lista");
    }

    @Test
    public void testBuscarVehiculo() {
        LOG.info("Iniciado testAssertEquals buscar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("12345", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertEquals(van1, empleado.buscarVehiculo("12345"));
        LOG.info("Finalizando testAssertEquals buscar vehiculo");
    }

    @Test
    public void testEditarVehiculo() {
        LOG.info("Iniciado testAssertEquals editar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        Van vanEditada = new Van("456", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false,
                0, false, false);
        empleado.añadirVehiculo(van1);
        empleado.añadirVehiculo(vanEditada);
        assertEquals("Editado correctamente", empleado.editarVehiculo(van1, vanEditada));
        LOG.info("Finalizando testAssertEquals editar vehiculo");
    }

    @Test
    public void testEditarVehiculoNulo() {
        LOG.info("Iniciado testAssertEquals editar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        Van vanEditada = new Van("456", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false,
                0, false, false);
        empleado.añadirVehiculo(van1);
        empleado.añadirVehiculo(vanEditada);
        assertThrows(IllegalArgumentException.class, () -> empleado.editarVehiculo(null, vanEditada));
        LOG.info("Finalizando testAssertEquals editar vehiculo");
    }

    @Test
    public void testEditarVehiculoLista() {
        LOG.info("Iniciado testAssertEquals editar vehiculo lista");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Van van1 = new Van("123", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false, 0,
                false, false);
        Van vanEditada = new Van("456", null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false, false,
                0, false, false);
        empleado.añadirVehiculo(van1);
        assertEquals("No se encuentra en la lista", empleado.editarVehiculo(vanEditada, van1));
        LOG.info("Finalizando testAssertEquals editar vehiculo lista");
    }

    @Test
    public void testVerificarCredenciales() {
        LOG.info("Iniciado testVerificarCredenciales");
        Concesionario concesionario = new Concesionario("m");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        concesionario.añadirEmpleado(empleado1);
        assertEquals(empleado1, concesionario.verificarCredenciales("123", "contraseña"));
        LOG.info("Finalizando testVerificarCredenciales");
    }

    @Test
    public void testRecuperarContraseña() {
        LOG.info("Iniciado testAssertEquals recuperar contraseña");
        Empleado empleado1 = new Empleado("12345", "Juan", true, "juan@gmail.com", "123", "contraseña");
        assertEquals("Contraseña: contraseña Correo de recuperación enviado a juan@gmail.com",
                empleado1.recuperarContraseña("juan@gmail.com"));
        LOG.info("Finalizando testAssertEquals recuperar contraseña");
    }

    @Test
    public void testAlquilarVehiculo() {
        LOG.info("Iniciado testAssertEquals alquilar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        empleado.añadirCliente(cliente1);
        Van van1 = new Van("123", "Toyota", null, false, 0, 0, null, 0, 0, true, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertEquals("vehiculoVan [getMarca()=Toyota, getMatricula()=123] alquilado por 3 dias",
                empleado.alquilarVehiculo(van1, 3, cliente1, LocalDate.of(2024, 11, 18)));
        LOG.info("Finalizando testAssertEquals alquilar vehiculo");
    }

    @Test
    public void testVenderVehiculo() {
        LOG.info("Iniciado testAssertEquals vender vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        empleado.añadirCliente(cliente1);
        Van van1 = new Van("123", "Toyota", null, false, 0, 0, null, 0, 0, true, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertEquals("vehiculoVan [getMarca()=Toyota, getMatricula()=123] vendido",
                empleado.venderVehiculo(van1, cliente1, LocalDate.of(2024, 11, 19)));
        LOG.info("Finalizando testAssertEquals vender vehiculo");
    }

    @Test
    public void testComprarVehiculo() {
        LOG.info("Iniciado testAssertEquals comprar vehiculo");
        Empleado empleado = new Empleado(null, null, false, null, null, null);
        Cliente cliente1 = new Cliente("1234", "Juan", "313111");
        empleado.añadirCliente(cliente1);
        Van van1 = new Van("123", "Toyota", null, false, 0, 0, null, 0, 0, true, null, null, 0, 0, 0, false, false, 0,
                false, false);
        empleado.añadirVehiculo(van1);
        assertEquals(
                "Vehiculo Van [getMarca()=Toyota, getMatricula()=123]comprado aCliente [idCliente=1234, nombre=Juan]",
                empleado.comprarVehiculo(van1, cliente1, LocalDate.of(2024, 11, 20), 2000000, true));
        LOG.info("Finalizando testAssertEquals comprar vehiculo");
    }

    @Test
    public void testBloquearEmpleado() {
        LOG.info("Iniciado testAssertEquals bloquear empleado");
        Administrador administrador = new Administrador("123", "roberto", true, "roberto@gmail.com", "jaja", "ola");
        assertEquals("bloqueado con exito", administrador.bloquearEmpleado(administrador));
        LOG.info("Finalizando testAssertEquals bloquear empleado");
    }

    @Test
    public void testListaReporte() {
        LOG.info("Iniciado testAssertEquals lista reportes");
        Administrador administrador = new Administrador("123", "roberto", true, "roberto@gmail.com", "jaja", "ola");
        Vehiculo vehiculo1 = new Van(null, null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false,
                false, 0, false, false);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 19), 0, true);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 19), 0, false);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 21), 0, true);
        Reporte reporte = new Reporte("123", administrador.getListaTransacciones(), administrador,
                LocalDate.of(2024, 11, 18), LocalDate.of(2024, 11, 20));
        List<?> listaEsperada = List.of(reporte.getListaTransacciones());
        assertEquals(listaEsperada,
                List.of(administrador
                        .crearReporte("123", administrador, LocalDate.of(2024, 11, 18), LocalDate.of(2024, 11, 20))
                        .getListaTransacciones()));
        LOG.info("Finalizando testAssertEquals lista reportes");
    }

    @Test
    public void testTransacciones() {
        LOG.info("Iniciado testAssertEquals transacciones");
        Administrador administrador = new Administrador("123", "roberto", true, "roberto@gmail.com", "jaja", "ola");
        Vehiculo vehiculo1 = new Van(null, null, null, false, 0, 0, null, 0, 0, false, null, null, 0, 0, 0, false,
                false, 0, false, false);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 19), 0, true);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 19), 0, false);
        administrador.comprarVehiculo(vehiculo1, null, LocalDate.of(2024, 11, 21), 0, true);
        Reporte reporte = new Reporte("123", administrador.getListaTransacciones(), administrador,
                LocalDate.of(2024, 11, 18), LocalDate.of(2024, 11, 20));
        List<?> listaEsperada = (reporte.getListaTransacciones());
        assertEquals(listaEsperada, reporte.getListaTransacciones());
        LOG.info("Finalizando testAssertEquals transacciones");
    }

}
