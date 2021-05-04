package interfaceAbstractDemoo.Concrete;

import interfaceAbstractDemoo.Abstract.BaseCustomerManager;
import interfaceAbstractDemoo.Abstract.CustomerCheckService;
import interfaceAbstractDemoo.Entities.Customer;



public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customercheckservice;
	public NeroCustomerManager(CustomerCheckService customercheckservice) {
		
		this.customercheckservice = customercheckservice;
	}
	@Override
	public void Save(Customer customer) {
		if(customercheckservice.checkIfRealCustomer(customer))
		{
			System.out.println("M��teri veritaban�na ba�ar�yla kaydedildi nero");
		}
		else
		{
			System.out.println("Hatal� bilgiler");
		}
		
	}

	

}
