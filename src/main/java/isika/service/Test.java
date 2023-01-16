package isika.service;


import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import isika.entity.Customer;


public class Test {

	public static void main(String[] args) {
		
		try (// service sur spring
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
			appContext.scan("isika.*");
			
			appContext.refresh();
			
			CustomerService service = (CustomerService)appContext.getBean("customerService");

			Customer c = new Customer(1l, "grsbill", "martin@oi.fr", "paris");
			service.sauve(c);
			service.sauve(new Customer(2l, "raoul", "roual@free.fr", "nice"));
			List<Customer> l = service.liste();
			l.forEach(System.out::println);
		} catch (BeansException | IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}