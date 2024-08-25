/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clientreservation.controller;

import com.example.clientreservation.entity.Reservation;
import com.example.clientreservation.service.ReservationService;
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
 * @author rusira
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReservationController {
    @Autowired
    private ReservationService reservationservice;
    
    @GetMapping(path = "/reservations")
     public List<Reservation> getAllReservations(){
         return reservationservice.getAllReservations();
     }
    @GetMapping(path = "/reservations/{id}")
    public Reservation getReservationbyId(@PathVariable int id){
         return reservationservice.getReservationbyId(id);
     }
    @PostMapping(path = "/reservations")
    public Reservation createReservation(@RequestBody Reservation reservation_tbl) {    
           return reservationservice.createReservation(reservation_tbl);
     }  
    @PutMapping(path = "/reservations")
    public Reservation updateReservation(@RequestBody Reservation reservation_tbl){
             return reservationservice.updateReservation(reservation_tbl);
     }
    @DeleteMapping(path = "/reservations/{id}")
    public void deleteReservationId(@PathVariable int id){
            reservationservice.deleteReservationId(id);
     }      
        
}
