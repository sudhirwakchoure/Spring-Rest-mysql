package com.manage.school.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String MotherName;
    private String FartherName;
    private String Address;
    private String Phone;

    public Parents(String motherName, String fartherName, String address, String Phone) {
        MotherName = motherName;
        FartherName = fartherName;
        Address = address;
        this.Phone = Phone;
    }

    public Parents() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getFartherName() {
        return FartherName;
    }

    public void setFartherName(String fartherName) {
        FartherName = fartherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }



}
