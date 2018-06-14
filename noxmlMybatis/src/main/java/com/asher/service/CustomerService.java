package com.asher.service;

import com.asher.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    public int deleteCustomer(int customer_id);

    public int updateCustomer(Customer customer);

    public int insertCustomer(Customer customer);

    public List<Customer> getAllCustomer();

    public Customer queryCustomerById(int customer_id);

}
