import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConectandoApi {
    private double conversionRate;
    private double valorEscolhido;

    public double getConversionRate() {
        return conversionRate;
    }

    public double getValorEscolhido() {
        return valorEscolhido;
    }

    public void setValorEscolhido(double valorEscolhido) {
        this.valorEscolhido = valorEscolhido;
    }

    public double conversao(String moedaEscolhida, String moedaConversora) {
        String chaveApi = "fcd07aea90089d23b20c7e0a";
        String endereco = "https://v6.exchangerate-api.com/v6/" + chaveApi + "/pair/" + moedaEscolhida + "/" + moedaConversora;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            System.out.println(responseBody);

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);

            // busca o valor de conversion_rate no json retornado pela Api
            conversionRate = jsonObject.get("conversion_rate").getAsDouble();
            return conversionRate;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public double calculoConversao() {
        return getValorEscolhido() * getConversionRate();
    }
}

//TO-DO
//- tratar melhor as exceções/erros