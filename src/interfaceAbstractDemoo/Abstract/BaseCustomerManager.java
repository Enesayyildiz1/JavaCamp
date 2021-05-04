package interfaceAbstractDemoo.Abstract;

import interfaceAbstractDemoo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public abstract void Save(Customer customer) ;
		
		
	

}
