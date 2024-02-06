package com.hotelbooking.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookedRooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name = "check_in")
	private LocalDate checkInDate;
	
	@Column(name = "check_out")
	private LocalDate checkOutDate;
	
	@Column(name = "guest_fullname")
	private String guestFullName;
	
	@Column(name = "guest_email")
	private String guestEmail;
	
	@Column(name = "adults")
	private int numberOfAdults;
	
	@Column(name = "childrens")
	private int numberOfChildrens;
	
	@Column(name = "total_guest")
	private int totalNumberOfGuest;
	
	@Column(name = "confirmation_code")
	private String bookingConfirmationCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;
	
	public void calculateTotalNumberofGuest() {
		this.totalNumberOfGuest = this.numberOfAdults + numberOfChildrens;
	}
	
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
		calculateTotalNumberofGuest();
	}
	
	public void setNumberOfChildrens(int numberOfChildrens) {
		this.numberOfChildrens = numberOfChildrens;
		calculateTotalNumberofGuest();
	}

	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
	
	

}
