package com.example.RealEstateListing.Implementation;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;
import com.example.RealEstateListing.Repository.PropertyRepository;
import com.example.RealEstateListing.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public boolean addProperty(Property property) {
        try {
            propertyRepository.save(property);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateProperty(Property property) {
        return false;
    }

    @Override
    public boolean deleteProperty(int id) {
        return false;
    }

    @Override
    public List<Property> getAllProperties() {
        return (List<Property>) propertyRepository.findAll();
    }

    @Override
    public List<Property> getPropertiesByRealtor(Realtor realtor) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByType(String type) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByAddress(String address) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByAreaGreaterThanEqual(double area) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByAreaLessThanEqual(double area) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByBedrooms(int bedrooms) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByBedroomGreaterThanOrEqual(int bedrooms) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByBathrooms(int bathrooms) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByBathroomGreaterThanOrEqual(int bathrooms) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByPriceLessThanEqual(double price) {
        return null;
    }

    @Override
    public List<Property> getPropertiesByPriceGreaterThanEqual(double price) {
        return null;
    }

    @Override
    public List<Property> getPropertiesListedAfter(long date) {
        return null;
    }

    @Override
    public List<Property> getPropertiesListedBefore(long date) {
        return null;
    }
}

