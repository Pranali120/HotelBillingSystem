
import java.util.ArrayList;
import java.util.List;

public class HotelBillingMain {

	float calculateBill(List<Order> odr) {
		float temp = 0.0f;
		if (odr.isEmpty()) {
			return 0.0f;
		}

		else
			for (Order order : odr) {

				temp = temp + (order.getOrderPrice() * order.getOrderQuantity());

			}
		return temp;

	}

	public static void main(String[] args) {

		float bill, bill1, totalBill;
		List<Order> order1 = new ArrayList<Order>();
        Order item1 = new Order(1, "Roti", 15, 3);
		order1.add(item1);
		Order item2 = new Order(2, "Bhaji", 90, 1);
		order1.add(item2);

		Customer customer1 = new Customer(1, "Pranali", 123456, order1);
		
		HotelBillingMain h= new HotelBillingMain();
		bill = h.calculateBill(order1);
		System.out.println("Bill for customer" + customer1.getName() + " = Rs "+bill);
		
		List<Order> order2 = new ArrayList<Order>();
		Order item3 = new Order(1, "chapati", 10, 3);
		order2.add(item3);
		Order item4 = new Order(2, "dal", 40, 1);
		order2.add(item4);
		
		Customer Customer2 = new Customer(1,"ABC",123456,order2);
		HotelBillingMain h1 = new HotelBillingMain();
		bill1 = h1.calculateBill(order2);
		System.out.println("Bill for customer" + Customer2.getName() + " = Rs "+bill1);
		
		totalBill = bill + bill1;
		System.out.println(" total Bill = Rs "+totalBill);
	
		
		
	}

}
