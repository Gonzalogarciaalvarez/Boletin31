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

public class AreaVenta {
    
    private String nombre;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public AreaVenta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void añadirVendedor(Empregado vendedor) {

        listaVendedores.add((Vendedor) vendedor);
    }

    public void eliminarVendedor(Empregado vendedor) {

        listaVendedores.remove((Vendedor) vendedor);
    }
}
