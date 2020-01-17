package com.booking.commons;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class OfferDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idOffer;
	private String offerDetails;
	private Set<ReservationDTO> reservationsDTOList = new HashSet<ReservationDTO>(0);
	
	public int getIdOffer() {
		return idOffer;
	}
	public void setIdOffer(int idOffer) {
		this.idOffer = idOffer;
	}
	public String getOfferDetails() {
		return offerDetails;
	}
	public void setOfferDetails(String offerDetails) {
		this.offerDetails = offerDetails;
	}
	
	
	public Set<ReservationDTO> getReservationsDTOList() {
		return reservationsDTOList;
	}
	public void setReservationsDTOList(Set<ReservationDTO> reservationsDTOList) {
		this.reservationsDTOList = reservationsDTOList;
	}
	public OfferDTO(int idOffer, String offerDetails, Set<ReservationDTO> reservations1) {
		super();
		this.idOffer = idOffer;
		this.offerDetails = offerDetails;
		this.reservationsDTOList = reservations1;
	}
	public OfferDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OfferDTO [idOffer=" + idOffer + ", offerDetails=" + offerDetails + ", reservationsDTOList="
				+ reservationsDTOList + "]";
	}
	
	
}
