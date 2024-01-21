package entity;

public class OrderDetails {
    private Long orderDetailID;
    private Long orderID;
    private Long menuID;
    private Integer quantity;
    
    //parameterized constructor
	public OrderDetails(Long orderDetailID, Long orderID, Long menuID, Integer quantity) {
		super();
		this.orderDetailID = orderDetailID;
		this.orderID = orderID;
		this.menuID = menuID;
		this.quantity = quantity;
	}
	
	//getters and setters
	public Long getOrderDetailID() {
		return orderDetailID;
	}
	public void setOrderDetailID(Long orderDetailID) {
		this.orderDetailID = orderDetailID;
	}
	
	public Long getOrderID() {
		return orderID;
	}
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	public Long getMenuID() {
		return menuID;
	}
	public void setMenuID(Long menuID) {
		this.menuID = menuID;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "OrderDetails [orderDetailID=" + orderDetailID + ", orderID=" + orderID + ", menuID=" + menuID
				+ ", quantity=" + quantity + "]";
	}

    
}

