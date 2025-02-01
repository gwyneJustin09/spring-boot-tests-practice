package com.gwynejustin.unit_test.customer;

import com.gwynejustin.unit_test.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {
    private final CustomerRepo customerRepo;

    CustomerServiceImp(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer findCustomerById(long id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent())
            return customer.get();
        throw new CustomerNotFoundException("Customer with id " + id + " not found");
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomer(long id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent())
            customerRepo.delete(customer.get());
        throw new CustomerNotFoundException("Customer with id " + id + " not found");
    }
}
