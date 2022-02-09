package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.List;


public interface ParkingSpotService {

    ParkingSpotModel saveParking(ParkingSpotModel parkingSpotModel);


    boolean existsByLicensePlateCar(String licencePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    List<ParkingSpotModel> findAll();
}
