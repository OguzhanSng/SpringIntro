package springIntro;

public class MySqlCustomerDal implements ICustomerDal {
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println(connectionString);
		System.out.println("MySql Veritabanýna Eklendi");
	}

}
