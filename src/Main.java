import java.util.Date;

import interfaceAbstractDemoo.Abstract.BaseCustomerManager;
import interfaceAbstractDemoo.Concrete.CustomerCheckManager;
import interfaceAbstractDemoo.Concrete.NeroCustomerManager;
import interfaceAbstractDemoo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemoo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer=new Customer(1,"Enes","Ayyýldýz",new Date(2001,6,25),"1234678911");
		BaseCustomerManager customerManager=new NeroCustomerManager(new CustomerCheckManager());
		customerManager.Save(customer);

	}

}
