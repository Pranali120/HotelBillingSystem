
public class Order {
int orderId;
String orderName;
float orderPrice;
int orderQuantity;
public int getOrderId() {
	return orderId;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}


public Order(int orderId, String orderName, float orderPrice, int orderQuantity) {
	super();
	this.orderId = orderId;
	this.orderName = orderName;
	this.orderPrice = orderPrice;
	this.orderQuantity = orderQuantity;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public float getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(float orderPrice) {
	this.orderPrice = orderPrice;
}
public int getOrderQuantity() {
	return orderQuantity;
}
public void setOrderQuantity(int orderQuantity) {
	this.orderQuantity = orderQuantity;
}

}
