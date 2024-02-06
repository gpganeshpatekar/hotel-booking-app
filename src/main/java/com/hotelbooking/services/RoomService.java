package com.hotelbooking.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.entities.Room;

@Repository
public interface RoomService extends JpaRepository<Room, Long> {

}
