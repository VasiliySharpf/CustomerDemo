package net.customerdemo.sevice;

import net.customerdemo.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
