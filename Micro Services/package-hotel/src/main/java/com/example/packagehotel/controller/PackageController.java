/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.packagehotel.controller;

import com.example.packagehotel.entity.Package;
import com.example.packagehotel.service.PackageService;
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
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping(path = "/packages")
    public List<Package> getAllPackages() {
        return packageService.allPackage();
    }

    @PostMapping(path = "/packages")
    public Package createPackage(@RequestBody Package pk) {
        return packageService.createPackage(pk);
    }

    @PutMapping(path = "/packages")
    public Package updatePackage(@RequestBody Package pk) {
        return packageService.createPackage(pk);
    }

    @DeleteMapping(path = "/packages/{packageID}")
    public void deletePackage(@PathVariable int packageID) {
        packageService.deletePackage(packageID);
    }
}
