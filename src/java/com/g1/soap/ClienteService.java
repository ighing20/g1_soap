package com.g1.soap;

import controller.ClienteController;
import model.Cliente;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ClienteService {

    ClienteController clienteController = new ClienteController();

    @WebMethod
    public int suma(@WebParam(name = "number1") int number1, @WebParam(name = "number2") int number2) {
        return number1 + number2;
    }

    @WebMethod
    public String saludo() {
        return "Hola mundo";
    }

    @WebMethod
    public String agregarCliente(@WebParam(name = "id") int id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "direccion") String direccion,
            @WebParam(name = "telefono") String telefono) {

        return clienteController.agregarCliente(id, nombre, direccion, telefono);
    }

    @WebMethod
    public ArrayList<Cliente> listarClientes() {
        return clienteController.getClientes();
    }
}
