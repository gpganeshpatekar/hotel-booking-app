package com.hotelbooking.responses;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

	private Long bookingId;

	private LocalDate checkInDate;

	private LocalDate checkOutDate;

	private String guestFullName;

	private String guestEmail;

	private int numberOfAdults;

	private int numberOfChildrens;

	private int totalNumberOfGuest;

	private String bookingConfirmationCode;

	private RoomResponse room;

	public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate,
			String bookingConfirmationCode) {
		super();
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
	

}
