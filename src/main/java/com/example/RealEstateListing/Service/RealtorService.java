package com.example.RealEstateListing.Service;

import com.example.RealEstateListing.Model.Realtor;
import jakarta.persistence.Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RealtorService {
    boolean addRealtor(Realtor realtor);
    boolean updateRealtor(Realtor realtor);
    boolean deleteRealtor(int id);
    List<Realtor> getAllRealtors();
    List<Realtor> getRealtorByName(String name);
    List<Realtor> getRealtorByEmail(String email);
    List<Realtor> getRealtorByID(int id);
    List<Realtor> getRealtorByPhone(long phone);
}
