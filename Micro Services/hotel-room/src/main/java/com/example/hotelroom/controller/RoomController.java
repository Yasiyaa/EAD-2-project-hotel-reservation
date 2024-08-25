
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hotelroom.controller;

import com.example.hotelroom.service.RoomService;
import com.example.hotelroom.entity.Room;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Senan Sasnuka
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RoomController {
    
    @Autowired
    private RoomService roomService;
    
    @GetMapping(path = "/rooms")
    public List<Room> getAllRooms() {

        return roomService.allRooms();
    }
    
    @PostMapping(path = "/rooms")
    public Room createRoom(@RequestBody Room room){
        System.out.println(room);
        return roomService.createRoom(room);
    }
    
    @PutMapping(path = "/rooms")
    public Room updateRoom(@RequestBody Room room){
        return roomService.createRoom(room);
    }
    
    @PutMapping(path = "/rooms/{id}")
    public Room updateRoomStatus(@PathVariable int id){
        return roomService.updateRoomStatus(id);
    }
    
    @DeleteMapping(path = "/rooms/{roomNo}")
    public void deleteRoom(@PathVariable int roomNo){
        roomService.deleteRoom(roomNo);
    }
}
