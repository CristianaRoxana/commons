package com.booking.commons;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class CustomerDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerPhone;
	private String customerEmail;
	private Set<ReservationDTO> reservationDTOList;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Set<ReservationDTO> getReservationDTOList() {
		return reservationDTOList;
	}
	public void setReservationDTOList(Set<ReservationDTO> reservationDTOList) {
		this.reservationDTOList = reservationDTOList;
	}
	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDTO(int customerId, String customerFirstName, String customerLastName, String customerPhone,
			String customerEmail, Set<ReservationDTO> reservationDTOList) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.reservationDTOList = reservationDTOList;
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerPhone=" + customerPhone + ", customerEmail="
				+ customerEmail + ", reservationDTOList=" + reservationDTOList + "]";
	}
}
