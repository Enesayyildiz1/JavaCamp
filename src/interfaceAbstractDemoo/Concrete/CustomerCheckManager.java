package interfaceAbstractDemoo.Concrete;

import interfaceAbstractDemoo.Abstract.CustomerCheckService;
import interfaceAbstractDemoo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		if(customer.getNationalityId().length()==11)
		{
			return true;
		}
		else {
			return false;
		}
	}
  
}
