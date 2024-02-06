package com.hotelbooking.responses;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;


@Data
public class RoomResponse {

	private Long id;

	private String roomType;

	private double roomPrice;

	private boolean isBooked = false;

	private String photo;
	
	private List<BookingResponse> bookings;
	
	public RoomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RoomResponse(Long id, String roomType, double roomPrice, boolean isBooked, byte[] photoBytes,
			List<BookingResponse> bookings) {
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
		this.bookings = bookings;
	}

	
	

}
