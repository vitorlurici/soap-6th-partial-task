package br.edu.unifio.temperatura;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class ConversorTemperatura {

    @WebMethod(operationName = "CelsiusParaFahrenheit")
    public float celsiusParaFahrenheit(@WebParam(name = "celsius") float celsius) {
        return (celsius * 9/5) + 32;
    }

    @WebMethod(operationName = "CelsiusParaKelvin")
    public float celsiusParaKelvin(@WebParam(name = "celsius") float celsius) {
        return celsius + 273.15f;
    }

    @WebMethod(operationName = "FahrenheitParaCelsius")
    public float fahrenheitParaCelsius(@WebParam(name = "fahrenheit") float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    @WebMethod(operationName = "KelvinParaCelsius")
    public float kelvinParaCelsius(@WebParam(name = "kelvin") float kelvin) {
        return kelvin - 273.15f;
    }
}