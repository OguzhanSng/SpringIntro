package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//Constructor Injection
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}

	
	//Setter Injection-Fazla Tercih Edilmez
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		
		//Ýþ Kurallarý
		customerDal.add();
	}

}
