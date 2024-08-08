package softgrid.bms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import softgrid.bms.entity.Customer;
import softgrid.bms.repository.CustRepository;
import softgrid.bms.service.CustService;

@Service
public class CustServiceImpl implements CustService {
    @Autowired
	private CustRepository cRepo;
	
	@Override
	public ResponseEntity<Object> addNewCustomer(Customer cust) {
	    if (cust != null &&
	        cust.getAccOpenDate() != null && !cust.getAccOpenDate().isEmpty() &&
	        cust.getAddress() != null && !cust.getAddress().isEmpty() &&
	        cust.getAdharNo() != null && !cust.getAdharNo().isEmpty() &&
	        cust.getBalance() > 0 &&
	        cust.getBirthDate() != null &&
	        cust.getCusName() != null && !cust.getCusName().isEmpty() &&
	        cust.getEmail() != null && !cust.getEmail().isEmpty()) {
	        
	       // Save the customer if all checks pass
	        Customer savedCustomer = cRepo.save(cust);
	        return new ResponseEntity<>(savedCustomer,HttpStatus.CREATED);
	    }
	    else
	    // Return the original customer object if validation fails
	    //System.out.println("some data is null. All feilds are required");
 	    return new ResponseEntity<>("Filling All feilds is compulsory",HttpStatus.NOT_ACCEPTABLE);
	}


}
