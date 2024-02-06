package com.hotelbooking.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.entities.BookedRoom;

@Repository
public interface BookedRoomService extends JpaRepository<BookedRoom, Long> {

}
