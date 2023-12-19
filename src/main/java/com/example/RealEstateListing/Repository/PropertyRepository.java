package com.example.RealEstateListing.Repository;

import com.example.RealEstateListing.Model.Property;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropertyRepository extends CrudRepository<Property, Integer> {
    List<Property> findByAddress(String address);
    List<Property> findByType(String type);

    List<Property> findByBedrooms(int bedrooms);
    List<Property> findByBedroomsGreaterThanOrEqual(int bedrooms);
    List<Property> findByBathrooms(int bathrooms);
    List<Property> findByBathroomsGreaterThanOrEqual(int bathrooms);
    List<Property> findByAreaGreaterThanOrEqual(double area);
    List<Property> findByAreaLessThanOrEqual(double area);
    List<Property> findByPriceLessThanOrEqual(double price);
    List<Property> findByPriceGreaterThanOrEqual(double price);
    List<Property> findByListingDateAfter(long listingDate);
    List<Property> findByListingDateBefore(long listingDate);
}
