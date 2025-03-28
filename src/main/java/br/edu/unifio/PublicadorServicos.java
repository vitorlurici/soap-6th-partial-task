package br.edu.unifio;

import br.edu.unifio.temperatura.ConversorTemperatura;
import br.edu.unifio.moeda.ConversorMoeda;
import br.edu.unifio.media.CalculadoraMedia;
import br.edu.unifio.comparacao.ComparadorNumeros;
import jakarta.xml.ws.Endpoint;

public class PublicadorServicos {
    public static void main(String[] args) {
        String urlBase = "http://localhost:8080/soap/";

        Endpoint.publish(urlBase + "temperatura", new ConversorTemperatura());
        Endpoint.publish(urlBase + "moeda", new ConversorMoeda());
        Endpoint.publish(urlBase + "media", new CalculadoraMedia());
        Endpoint.publish(urlBase + "comparacao", new ComparadorNumeros());

        System.out.println("Serviços SOAP publicados com sucesso!");
        System.out.println("Temperatura: " + urlBase + "temperatura?wsdl");
        System.out.println("Moeda: " + urlBase + "moeda?wsdl");
        System.out.println("Média: " + urlBase + "media?wsdl");
        System.out.println("Comparação: " + urlBase + "comparacao?wsdl");
    }
}