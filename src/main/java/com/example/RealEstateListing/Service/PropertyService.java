package com.example.RealEstateListing.Service;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;

import java.util.List;

public interface PropertyService {
    boolean addProperty(Property property);
    boolean updateProperty(Property property);
    boolean deleteProperty(int id);
    List<Property> getAllProperties();
    List<Property> getPropertiesByRealtor(Realtor realtor);
    List<Property> getPropertiesByType(String type);
    List<Property> getPropertiesByAddress(String address);
    List<Property> getPropertiesByAreaGreaterThanEqual(double area);
    List<Property> getPropertiesByAreaLessThanEqual(double area);

    List<Property> getPropertiesByBedroomExact(int bedrooms);
    List<Property> getPropertiesByBedroomGreaterThanEqual(int bedrooms);
    List<Property> getPropertiesByBathroomExact(int bathrooms);
    List<Property> getPropertiesByBathroomGreaterThanEqual(int bathrooms);
    List<Property> getPropertiesByPriceLessThanEqual(double price);
    List<Property> getPropertiesByPriceGreatherThanEqual(double price);
    List<Property> getPropertiesListedAfter(long date);
    List<Property> getPropertiesListedBefore(long date);
}
