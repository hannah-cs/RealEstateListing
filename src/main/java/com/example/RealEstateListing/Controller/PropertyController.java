package com.example.RealEstateListing.Controller;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;
import com.example.RealEstateListing.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {
    private PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService){
        this.propertyService = propertyService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getAllProperties() {
        List<Property> properties = propertyService.getAllProperties();
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/address", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByAddress(@PathVariable String address) {
        List<Property> properties = propertyService.getPropertiesByAddress(address);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/realtor", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByRealtor(@PathVariable Realtor realtor) {
        List<Property> properties = propertyService.getPropertiesByRealtor(realtor);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/type", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByType(@PathVariable String type) {
        List<Property> properties = propertyService.getPropertiesByType(type);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/areafrom", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByAreaGT(@PathVariable Double area) {
        List<Property> properties = propertyService.getPropertiesByAreaGreaterThanEqual(area);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/areaupto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByAreaLT(@PathVariable Double area) {
        List<Property> properties = propertyService.getPropertiesByAreaLessThanEqual(area);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/bedrooms", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByBedrooms(@PathVariable int bedrooms) {
        List<Property> properties = propertyService.getPropertiesByBedroomExact(bedrooms);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/bedroomsfrom", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByBedroomsGT(@PathVariable int bedrooms) {
        List<Property> properties = propertyService.getPropertiesByBedroomGreaterThanEqual(bedrooms);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/bathrooms", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByBathrooms(@PathVariable int bathrooms) {
        List<Property> properties = propertyService.getPropertiesByBathroomExact(bathrooms);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/bathroomsfrom", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByBathroomsGT(@PathVariable int bathrooms) {
        List<Property> properties = propertyService.getPropertiesByBathroomGreaterThanEqual(bathrooms);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/pricefrom", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByPriceGT(@PathVariable Double price) {
        List<Property> properties = propertyService.getPropertiesByPriceGreatherThanEqual(price);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/priceupto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByPriceLT(@PathVariable Double price) {
        List<Property> properties = propertyService.getPropertiesByPriceLessThanEqual(price);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/listedafter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesAfterDate(@PathVariable long date) {
        List<Property> properties = propertyService.getPropertiesListedAfter(date);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @GetMapping(value = "/listedbefore", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Property>> getPropertiesByPriceLT(@PathVariable long date) {
        List<Property> properties = propertyService.getPropertiesListedBefore(date);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(properties);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProperty(@RequestBody Property newProperty) {
        boolean success = propertyService.addProperty(newProperty);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateProperty(@RequestBody Property updatedProperty) {
        boolean success = propertyService.updateProperty(updatedProperty);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProperty(@PathVariable int id) {
        boolean success = propertyService.deleteProperty(id);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
