/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clientreservation.service;

import com.example.clientreservation.entity.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.clientreservation.repository.ReservationRepository;

/**
 *
 * @author rusira
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationrepository;
       
    public List<Reservation> getAllReservations() {
        return reservationrepository.findAll();
    }
    public Reservation getReservationbyId(int id) {
        Optional<Reservation> userOptional = reservationrepository.findById(id);
        return userOptional.get();
    }      
    public Reservation createReservation(Reservation reservation_tbl) {
        return reservationrepository.save(reservation_tbl);
    }    
     public Reservation updateReservation(Reservation reservation_tbl) {
        return reservationrepository.save(reservation_tbl);
    }     
    public void deleteReservationId(int id){
         reservationrepository.deleteById(id);
    } 
       
}
