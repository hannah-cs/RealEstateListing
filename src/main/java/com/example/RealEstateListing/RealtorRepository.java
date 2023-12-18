package com.example.RealEstateListing;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RealtorRepository extends CrudRepository<Property, Integer> {
    List<Realtor> findByName(String name);
    List<Realtor> findByEmail(String email);
    List<Realtor> findByPhone(long phone);
}
