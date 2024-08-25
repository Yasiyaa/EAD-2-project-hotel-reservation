/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.packagehotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Senan Sasnuka
 */
@Entity
@Table(name="package_tbl")
public class Package {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int packageID;
    
    @Column(name="package_type")
    private String packageType;
     
    @Column(name="price")
    private double price;
    
    @Column(name="activity")
    private String activity;
    
    @Column(name="no_of_people")
    private String noOfPeople;
    
    @Column(name="about_package")
    private String aboutPackage;

    public int getPackageID() {
        return packageID;
    }

    public String getAboutPackage() {
        return aboutPackage;
    }

    public void setAboutPackage(String aboutPackage) {
        this.aboutPackage = aboutPackage;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(String noOfPeople) {
        this.noOfPeople = noOfPeople;
    }
    
    
}
