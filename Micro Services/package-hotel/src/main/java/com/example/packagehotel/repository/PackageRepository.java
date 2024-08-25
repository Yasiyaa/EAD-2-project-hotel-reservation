/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.packagehotel.repository;

import com.example.packagehotel.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Senan Sasnuka
 */
public interface PackageRepository extends JpaRepository<Package, Integer>{
    
}
