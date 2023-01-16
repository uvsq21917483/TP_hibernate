package isika.dao;

import org.springframework.data.repository.CrudRepository;

import isika.entity.Customer;


public interface RepositoryCustomer extends CrudRepository<Customer, Long> {
    // ajouter les méthodes bizarres
}