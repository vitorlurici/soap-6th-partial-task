package br.edu.unifio.comparacao;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class ComparadorNumeros {

    @WebMethod(operationName = "MaiorEntreDoisNumeros")
    public int maiorEntreDoisNumeros(
            @WebParam(name = "numero1") int num1,
            @WebParam(name = "numero2") int num2) {
        return Math.max(num1, num2);
    }

    @WebMethod(operationName = "MaiorEntreTresNumeros")
    public int maiorEntreTresNumeros(
            @WebParam(name = "numero1") int num1,
            @WebParam(name = "numero2") int num2,
            @WebParam(name = "numero3") int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}