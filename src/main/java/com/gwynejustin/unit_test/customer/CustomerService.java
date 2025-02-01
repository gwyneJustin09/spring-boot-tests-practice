package com.gwynejustin.unit_test.customer;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    Customer findCustomerById(long id);
    List<Customer> findAllCustomers();
    void deleteCustomer(long id);
}
