package br.com.jamesson.dip_ioc_di.repository;

import br.com.jamesson.dip_ioc_di.entity.Customer;

import java.sql.*;

public class CustomerRepository implements ICustomerRepository{

    @Override
    public Customer get(String customerId) throws SQLException {
        Customer customer = null;
        Connection conn = DriverManager.getConnection("CONN_STRING");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CUSTOMER WHERE ID=" + customerId);
        customer = new Customer(resultSet.getString(0), resultSet.getString(1));

        return customer;
    }

}
