package com.asher.dao;

import com.asher.entity.Customer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CustomerMapper {

    @Delete("DELETE FROM customer WHERE customer_id = #{customer_id}")
    public int deleteCustomer(@Param("customer_id") int customer_id);

    @Update("UPDATE customer SET first_name =#{first_name},last_name=#{last_name}  WHERE customer_id =#{customer_id} ")
    public int updateCustomer(Customer customer);

    @Select("select * from customer where customer_id=#{customer_id}")
    public Customer queryCustomerById(@Param("customer_id") int customer_id);

    @Insert("INSERT INTO customer VALUES(DEFAULT,#{first_name},#{last_name})")
    public int insert(Customer customer);

    @Select("select * from customer")
    public List<Customer> getAllCustomer();

}
