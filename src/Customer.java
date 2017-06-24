import java.util.List;

public class Customer {

	int id;
	String name;
	long phoneNumber;
	List<Order> order;

	public Customer() {
		super();
	}

	public Customer(int id, String name, long phoneNumber, List<Order> order) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
