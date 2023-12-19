package com.example.RealEstateListing.Service;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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

    List<Property> getPropertiesByBedrooms(int bedrooms);
    List<Property> getPropertiesByBedroomGreaterThanOrEqual(int bedrooms);
    List<Property> getPropertiesByBathrooms(int bathrooms);
    List<Property> getPropertiesByBathroomGreaterThanOrEqual(int bathrooms);
    List<Property> getPropertiesByPriceLessThanEqual(double price);
    List<Property> getPropertiesByPriceGreaterThanEqual(double price);
    List<Property> getPropertiesListedAfter(long date);
    List<Property> getPropertiesListedBefore(long date);
}
