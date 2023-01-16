package isika.service;

import isika.entity.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isika.dao.RepositoryCustomer;


@Service  // equivalent de component
public class CustomerService {
	@Autowired
	RepositoryCustomer repo;

	public void sauve(Customer c ) {
		repo.save(c);
	}

	public List<Customer> liste() {
		List<Customer> li =  (List<Customer>) repo.findAll() ;
		return li;
	}

	public Customer get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	

}