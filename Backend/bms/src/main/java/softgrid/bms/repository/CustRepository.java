package softgrid.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import softgrid.bms.entity.Customer;

public interface CustRepository extends JpaRepository<Customer, Integer> {

}
