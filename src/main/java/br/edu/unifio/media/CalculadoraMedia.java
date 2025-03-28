package br.edu.unifio.media;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class CalculadoraMedia {

    @WebMethod(operationName = "MediaAritmeticaDoisNumeros")
    public float mediaAritmeticaDoisNumeros(
            @WebParam(name = "numero1") float num1,
            @WebParam(name = "numero2") float num2) {
        return (num1 + num2) / 2;
    }

    @WebMethod(operationName = "MediaPonderadaDoisNumeros")
    public float mediaPonderadaDoisNumeros(
            @WebParam(name = "numero1") float num1,
            @WebParam(name = "peso1") float peso1,
            @WebParam(name = "numero2") float num2,
            @WebParam(name = "peso2") float peso2) {
        return (num1 * peso1 + num2 * peso2) / (peso1 + peso2);
    }

    @WebMethod(operationName = "MediaAritmeticaTresNumeros")
    public float mediaAritmeticaTresNumeros(
            @WebParam(name = "numero1") float num1,
            @WebParam(name = "numero2") float num2,
            @WebParam(name = "numero3") float num3) {
        return (num1 + num2 + num3) / 3;
    }

    @WebMethod(operationName = "MediaPonderadaTresNumeros")
    public float mediaPonderadaTresNumeros(
            @WebParam(name = "numero1") float num1,
            @WebParam(name = "peso1") float peso1,
            @WebParam(name = "numero2") float num2,
            @WebParam(name = "peso2") float peso2,
            @WebParam(name = "numero3") float num3,
            @WebParam(name = "peso3") float peso3) {
        return (num1 * peso1 + num2 * peso2 + num3 * peso3) /
                (peso1 + peso2 + peso3);
    }

}