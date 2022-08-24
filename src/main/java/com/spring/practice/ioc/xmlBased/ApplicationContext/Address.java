package com.spring.practice.ioc.xmlBased.ApplicationContext;

public class Address {
    private String flatNo = "401";
    private String apartmentNo = "Motati Maple Apartment";

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }
}
