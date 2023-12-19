package com.example.RealEstateListing.Service;

import com.example.RealEstateListing.Model.Realtor;

import java.util.List;

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
