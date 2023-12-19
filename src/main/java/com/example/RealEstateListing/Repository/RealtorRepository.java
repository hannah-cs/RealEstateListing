package com.example.RealEstateListing.Repository;

import com.example.RealEstateListing.Model.Property;
import com.example.RealEstateListing.Model.Realtor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RealtorRepository extends CrudRepository<Property, Integer> {
    List<Realtor> findByName(String name);
    List<Realtor> findByEmail(String email);
    List<Realtor> findByPhone(long phone);
}
