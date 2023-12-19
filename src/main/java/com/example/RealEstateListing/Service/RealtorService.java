package com.example.RealEstateListing.Service;

import com.example.RealEstateListing.Model.Realtor;

import java.util.List;

public interface RealtorService {
    void addRealtor(Realtor realtor);
    void updateRealtor(Realtor realtor);
    void deleteRealtor(Realtor realtor);
    List<Realtor> getAllRealtors();
    List<Realtor> getRealtorByName(String name);
    List<Realtor> getRealtorByEmail(String email);
    List<Realtor> getRealtorByID(int id);
    List<Realtor> getRealtorByPhone(long phone);
}
