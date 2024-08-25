/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.packagehotel.service;

import com.example.packagehotel.entity.Package;
import com.example.packagehotel.repository.PackageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Senan Sasnuka
 */
@Service
public class PackageService {
    
   @Autowired
   private PackageRepository packageRepository;
   
    public List<Package> allPackage(){ 
         return packageRepository.findAll();
     }
   public Package createPackage(Package pk){
       return packageRepository.save(pk);
   }
   
    public Package updatePackage(Package pk){
       return packageRepository.save(pk);
    }
    
    public void deletePackage(int packageID) {
        packageRepository.deleteById(packageID);
    }
}
