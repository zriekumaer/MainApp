package com.inventory.service;

import com.inventory.dto.CustomerDTO;
import com.inventory.dto.UserDTO;

public interface CustomerService {
	public void addCustomer(CustomerDTO customerDTO);
	public void editCustomer(CustomerDTO customerDTO);
	public void deleteCustomer(CustomerDTO customerDTO);
}
