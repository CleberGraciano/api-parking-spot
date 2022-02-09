package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ParkingSpotService {

    ParkingSpotModel saveParking(ParkingSpotModel parkingSpotModel);

    boolean existsByLicensePlateCar(String licencePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    List<ParkingSpotModel> findAll();

    Optional<ParkingSpotModel> findById(UUID id);
}
