package controller;

import model.Cliente;
import java.util.ArrayList;

public class ClienteController {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ClienteController() {
    }

    public String agregarCliente(int id, String nombre, String direccion, String telefono) {
        Cliente c = new Cliente(id, nombre, direccion, telefono);
        clientes.add(c);

        return "Cliente Agregado: " + nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
}
