package interfaceAbstractDemoo.Abstract;

import interfaceAbstractDemoo.Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealCustomer(Customer customer);
}
