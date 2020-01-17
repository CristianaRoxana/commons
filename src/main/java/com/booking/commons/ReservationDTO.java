package com.booking.commons;

//import com.booking.persistence.model.Customer;
//import com.booking.persistence.model.Offer;

public class ReservationDTO {
	private int reservationId;
	private int reservationPrice;
	@Override
	public String toString() {
		return "ReservationDTO [reservationId=" + reservationId + ", reservationPrice=" + reservationPrice
				+ ", reservationDateStart=" + reservationDateStart + ", reservationDateEnd=" + reservationDateEnd
				+ ", reservationLocation=" + reservationLocation + ", reservationDescription=" + reservationDescription
				+ "]";
	}
	private String reservationDateStart;
	private String reservationDateEnd;
	private String reservationLocation;
	private String reservationDescription;
	//private Customer customer;
	//private Offer offer;
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public int getReservationPrice() {
		return reservationPrice;
	}
	public void setReservationPrice(int reservationPrice) {
		this.reservationPrice = reservationPrice;
	}
	public String getReservationDateStart() {
		return reservationDateStart;
	}
	public void setReservationDateStart(String reservationDateStart) {
		this.reservationDateStart = reservationDateStart;
	}
	public String getReservationDateEnd() {
		return reservationDateEnd;
	}
	public void setReservationDateEnd(String reservationDateEnd) {
		this.reservationDateEnd = reservationDateEnd;
	}
	public String getReservationLocation() {
		return reservationLocation;
	}
	public void setReservationLocation(String reservationLocation) {
		this.reservationLocation = reservationLocation;
	}
	public String getReservationDescription() {
		return reservationDescription;
	}
	public void setReservationDescription(String reservationDescription) {
		this.reservationDescription = reservationDescription;
	}
	public ReservationDTO(int reservationId,  String reservationDescription) {
		super();
		this.reservationId = reservationId;
		this.reservationDescription = reservationDescription;
	}
	public ReservationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
