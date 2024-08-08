package softgrid.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import softgrid.bms.entity.Customer;

@Repository
public interface CustRepository extends JpaRepository<Customer, Long> {

}
