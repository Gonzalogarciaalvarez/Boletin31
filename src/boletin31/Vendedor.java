/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin31;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */

public class Vendedor extends Empregado {
    
    private Coche coche;
    private String tlfMobil;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private float porcentaxeComision = 0;

    public Vendedor(Coche coche, String tlfMobil, float comision, String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedade, telefono, salario);

        this.coche = coche;
        this.tlfMobil = tlfMobil;
        this.porcentaxeComision = comision;
    }

    public void añadirCliente(Cliente cliente) {

        listaClientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {

        listaClientes.remove(cliente);
    }

    public void cambiarCoche(Coche coche) {

        this.coche = coche;
    }

    @Override
    public void imprimir() {

        System.out.println(super.toString() + this.toString());
    }

    @Override
    public void cambiarSupervisor(XefeZona jefe) {

        super.setJefe(jefe);
    }

    @Override
    public void incrementarSalario() {
        super.setSalario((this.getSalario() * 0.10f) * super.getAñosAntiguedade());
    }

    @Override
    public String toString() {
        return ", Coche: " + this.coche + ", tlfMobil: " + this.tlfMobil + ", porcentaxeComision:" + this.porcentaxeComision + "%";
    }
}
