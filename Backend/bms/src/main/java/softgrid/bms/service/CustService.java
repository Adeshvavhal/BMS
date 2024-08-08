package softgrid.bms.service;

import org.springframework.http.ResponseEntity;

import softgrid.bms.entity.Customer;

public interface CustService {

	ResponseEntity<Object> addNewCustomer(Customer cust);

}
