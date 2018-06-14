package com.asher.service.impl;

import com.asher.dao.CustomerMapper;
import com.asher.entity.Customer;
import com.asher.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public int deleteCustomer(int customer_id) {
        return customerMapper.deleteCustomer(customer_id);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public Customer queryCustomerById(int customer_id) {
        return customerMapper.queryCustomerById(customer_id);
    }

    @Override
    public int insertCustomer(Customer customer) {
        return customerMapper.insert(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerMapper.getAllCustomer();
    }

}
