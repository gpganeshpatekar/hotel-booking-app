package com.hotelbooking.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hotelbooking.entities.Room;
import com.hotelbooking.responses.RoomResponse;
import com.hotelbooking.services.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RoomController {
	
	private final RoomService roomService;
	
	

}
