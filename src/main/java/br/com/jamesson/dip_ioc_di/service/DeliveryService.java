package br.com.jamesson.dip_ioc_di.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeliveryService implements IDeliveryService {

    @Override
    public BigDecimal GetDeliveryFee(String zipcode) throws IOException {
        BigDecimal deliveryFee = new BigDecimal(0);
        var url = new URL("URL/" + zipcode);
        HttpURLConnection request = (HttpURLConnection) url.openConnection(); //HttpRequestMessage(HttpMethod.Get, "URL/" + zipCode);
        request.setRequestMethod("GET");
        request.setRequestProperty("Accept", "application/json");
        request.setRequestProperty("User-Agent", "HttpClientFactory-Sample");
        request.getResponseCode();
        deliveryFee = BigDecimal.valueOf(5);

        return deliveryFee;
    }
}
