package br.edu.unifio.moeda;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class ConversorMoeda {

    private static final float TAXA_DOLAR = 5.7f;
    private static final float TAXA_EURO = 6.2f;
    private static final float TAXA_GUARANI = 0.0008f;
    private static final float TAXA_PESO_ARG = 0.05f;

    @WebMethod(operationName = "RealParaDolar")
    public float realParaDolar(@WebParam(name = "real") float real) {
        return real / TAXA_DOLAR;
    }

    @WebMethod(operationName = "DolarParaReal")
    public float dolarParaReal(@WebParam(name = "dolar") float dolar) {
        return dolar * TAXA_DOLAR;
    }

    @WebMethod(operationName = "RealParaEuro")
    public float realParaEuro(@WebParam(name = "real") float real) {
        return real / TAXA_EURO;
    }

    @WebMethod(operationName = "EuroParaReal")
    public float euroParaReal(@WebParam(name = "euro") float euro) {
        return euro * TAXA_EURO;
    }

    @WebMethod(operationName = "RealParaGuarani")
    public float realParaGuarani(@WebParam(name = "real") float real) {
        return real / TAXA_GUARANI;
    }

    @WebMethod(operationName = "GuaraniParaReal")
    public float guaraniParaReal(@WebParam(name = "guarani") float guarani) {
        return guarani * TAXA_GUARANI;
    }

    @WebMethod(operationName = "RealParaPesoArgentino")
    public float realParaPesoArgentino(@WebParam(name = "real") float real) {
        return real / TAXA_PESO_ARG;
    }

    @WebMethod(operationName = "PesoArgentinoParaReal")
    public float pesoArgentinoParaReal(@WebParam(name = "pesoArgentino") float pesoArgentino) {
        return pesoArgentino * TAXA_PESO_ARG;
    }

}