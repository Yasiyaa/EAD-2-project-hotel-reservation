/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hotelroom.service;

import com.example.hotelroom.entity.Room;
import com.example.hotelroom.repository.RoomRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Senan Sasnuka
 */
@Service
public class RoomService {
    
     @Autowired 
    private RoomRepository roomRepository;
     
     public List<Room> allRooms(){ 
         return roomRepository.findAll();
     }
     
    public Room createRoom(Room room){
        return roomRepository.save(room);
    }
    
    public Room updateRoom(Room room){
       return roomRepository.save(room);
    }
    
    public Room updateRoomStatus(int id){
        String st="false";
        roomRepository.SetRoomStatus(id,st);
        return null;
    }
    
    
    public void deleteRoom(int roomNo) {
        roomRepository.deleteById(roomNo);
    }
   
}
