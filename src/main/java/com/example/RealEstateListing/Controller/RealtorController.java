package com.example.RealEstateListing.Controller;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;
import com.example.RealEstateListing.Service.PropertyService;
import com.example.RealEstateListing.Service.RealtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/realtors")
public class RealtorController {
    private RealtorService realtorService;

    @Autowired
    public RealtorController(RealtorService realtorService){
        this.realtorService = realtorService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Realtor>> getAllRealtors() {
        List<Realtor> realtors = realtorService.getAllRealtors();
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(realtors);
    }

    @GetMapping(value = "/name",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Realtor>> getRealtorByName(@PathVariable String name) {
        List<Realtor> realtors = realtorService.getRealtorByName(name);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(realtors);
    }

    @GetMapping(value = "/email",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Realtor>> getRealtorByEmail(@PathVariable String email) {
        List<Realtor> realtors = realtorService.getRealtorByEmail(email);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(realtors);
    }

    @GetMapping(value = "/phone",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Realtor>> getRealtorByPhone(@PathVariable long phone) {
        List<Realtor> realtors = realtorService.getRealtorByPhone(phone);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(realtors);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createRealtor(@RequestBody Realtor newRealtor) {
        boolean success = realtorService.addRealtor(newRealtor);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateRealtor(@RequestBody Realtor updatedRealtor) {
        boolean success = realtorService.updateRealtor(updatedRealtor);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRealtor(@PathVariable int id) {
        boolean success = realtorService.deleteRealtor(id);
        if (success) {
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
