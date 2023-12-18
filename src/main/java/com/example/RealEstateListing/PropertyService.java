package com.example.RealEstateListing;

import java.util.List;

public interface PropertyService {
    void addProperty(Property property);
    void updateProperty(Property property);
    void deleteProperty(Property property);
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
