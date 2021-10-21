package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

@Entity
public class House {
	@Id
	@GeneratedValue
	private int id;
	private int numOfBedrooms;
	private int numOfBathrooms;
	private String address;
	private double price;
	
	
	public House() {
		
	}
	
	public House(int numOfBedrooms, int numOfBathrooms, String address, double price) {
		this.numOfBedrooms = numOfBedrooms;
		this.numOfBathrooms = numOfBathrooms;
		this.address = address;
		this.price = price;
	}
	
	public House(int id, int numOfBedrooms, int numOfBathrooms, String address, double price) {
		super();
		this.id = id;
		this.numOfBedrooms = numOfBedrooms;
		this.numOfBathrooms = numOfBathrooms;
		this.address = address;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the numOfBedrooms
	 */
	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}
	/**
	 * @param numOfBedrooms the numOfBedrooms to set
	 */
	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = numOfBedrooms;
	}
	/**
	 * @return the numOfbathrooms
	 */
	public int getNumOfBathrooms() {
		return numOfBathrooms;
	}
	/**
	 * @param numOfbathrooms the numOfbathrooms to set
	 */
	public void setNumOfBathrooms(int numOfBathrooms) {
		this.numOfBathrooms = numOfBathrooms;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", numOfBedrooms=" + numOfBedrooms + ", numOfbathrooms=" + numOfBathrooms
				+ ", address=" + address + ", price=" + price + "]";
	}
}

