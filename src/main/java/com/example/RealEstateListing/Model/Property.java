package com.example.RealEstateListing.Model;

import com.example.RealEstateListing.Model.Realtor;
import jakarta.persistence.*;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String type;
    private double price;
    private double area;
    private int bedrooms;
    private int bathrooms;
    private long listingDate;

    @ManyToOne
    @JoinColumn(name="realtor_id")
    private Realtor realtor;

    public Property() {
    }

    public Property(int id, String address, String type, double price, double area, int bedrooms, int bathrooms, long listingDate) {
        this.id = id;
        this.address = address;
        this.type = type;
        this.price = price;
        this.area = area;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.listingDate = listingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public long getListingDate() {
        return listingDate;
    }

    public void setListingDate(long listingDate) {
        this.listingDate = listingDate;
    }
}
