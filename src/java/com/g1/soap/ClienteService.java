package com.g1.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ClienteService {

    @WebMethod
    public int suma(@WebParam(name = "number1") int number1, @WebParam(name = "number2") int number2) {
        return number1 + number2;
    }
    
    @WebMethod
    public String saludo() {
        return "Hola mundo";
    }
}
