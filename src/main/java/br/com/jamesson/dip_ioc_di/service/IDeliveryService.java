package br.com.jamesson.dip_ioc_di.service;

import java.io.IOException;
import java.math.BigDecimal;

public interface IDeliveryService {

    public BigDecimal GetDeliveryFee(String zipcode) throws IOException;

}
