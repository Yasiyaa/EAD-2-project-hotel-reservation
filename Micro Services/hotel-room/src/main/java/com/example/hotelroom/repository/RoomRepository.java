/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.hotelroom.repository;

import com.example.hotelroom.entity.Room;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Senan Sasnuka
 */
@Repository
@Transactional
public interface RoomRepository extends JpaRepository<Room, Integer>{
    
    @Modifying
    @Query("UPDATE Room u SET u.roomStatus =?2 WHERE u.roomID =?1 ")
    public void SetRoomStatus(int roomID,String st);
}
