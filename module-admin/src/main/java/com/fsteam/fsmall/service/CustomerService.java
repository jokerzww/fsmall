package com.fsteam.fsmall.service;

import com.fsteam.fsmall.model.Customer;

public interface CustomerService {
    Customer getCustomerById(String id);
    int addCustomer(Customer customer);
    int deleteCustomer(String id);
    int updateCustomer(Customer customer);
}
