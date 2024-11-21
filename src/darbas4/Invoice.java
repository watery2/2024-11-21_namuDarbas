package darbas4;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount)
	{
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getId()
	{
		return id;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public int getCustomerId()
	{
		return customer.getId();
	}
	
	public String getCustomerName()
	{
		return customer.getName();
	}
	
	public int getCustomerDiscount()
	{
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount()
	{
		float a = (float)customer.getDiscount();
		float proc = a / 100;
		
		return amount - amount*a;
	}
	
	@Override
	public String toString()
	{
		return "Invoice[id: " + id + ", customer: " + customer.toString() + ", amount: " + amount + "]";
	}
	
}
