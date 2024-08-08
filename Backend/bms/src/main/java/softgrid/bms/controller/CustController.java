package softgrid.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import softgrid.bms.entity.Customer;
import softgrid.bms.service.CustService;
@RequestMapping("customer")
@RestController
public class CustController {
	@Autowired
	private CustService cSer;
	
	@PostMapping("newCustomer")
	public ResponseEntity<?> addNewCustomer(@RequestBody Customer cust){
			ResponseEntity<Object> customer= cSer.addNewCustomer(cust);
			return customer;
		
	}
}
