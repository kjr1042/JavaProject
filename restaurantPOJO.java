package com.fda;
class restaurant
{
	private int restaurantId;
	private String name;
	private String cusineType;
	private String DeliveryTime;
	private String address;
	private float rating;
	private Boolean isActive;
	
	public restaurant() {
	}

	
	public restaurant(int restaurantId, String name, String cusineType, String deliveryTime, String address,
			float rating, Boolean isActive) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cusineType = cusineType;
		DeliveryTime = deliveryTime;
		this.address = address;
		this.rating = rating;
		this.isActive = isActive;
	}


	public int getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCusineType() {
		return cusineType;
	}


	public void setCusineType(String cusineType) {
		this.cusineType = cusineType;
	}


	public String getDeliveryTime() {
		return DeliveryTime;
	}


	public void setDeliveryTime(String deliveryTime) {
		DeliveryTime = deliveryTime;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
public class restaurantPOJO {

	public static void main(String[] args) {
		restaurant r = new restaurant(1,"MeghanaFoods","SouthIndian","11.23 AM","bangalore,India",4.2f,true);
		System.out.println("restaurantId: "+r.getRestaurantId());
		System.out.println("restaurantName: "+r.getName());
		System.out.println("CusineType: "+r.getCusineType());
		System.out.println("DeliveryTime: "+r.getDeliveryTime());
		System.out.println("restaurantAddress: "+r.getAddress());
		System.out.println("restaurantRating: "+r.getRating());
		System.out.println("restuarntIsActive: "+r.getIsActive());
	}

}
