/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin31;

/**
 *
 * @author Gonzalo
 */

public class Secretario extends Empregado {
    
    private Despacho despacho;
    private String numeroFax;

    public Secretario(Despacho despacho, String numeroFax, String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedade, telefono, salario);

        this.despacho = despacho;
        this.numeroFax = numeroFax;
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
        super.setSalario((this.getSalario() * 0.05f) * super.getAñosAntiguedade());
    }

    @Override
    public String toString() {
        return ", despacho: " + despacho + ", numeroFax: " + numeroFax;
    }
}
