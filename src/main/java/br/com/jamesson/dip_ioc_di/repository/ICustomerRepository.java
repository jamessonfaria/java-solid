package br.com.jamesson.dip_ioc_di.repository;

import br.com.jamesson.dip_ioc_di.entity.Customer;

import java.sql.SQLException;

public interface ICustomerRepository {

    public Customer get(String customerId) throws SQLException;

}
