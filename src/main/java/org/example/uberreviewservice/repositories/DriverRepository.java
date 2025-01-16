package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {


    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);
  //  Optional<Driver> findById

    @Query(nativeQuery = true, value = "SELECT * FROM Driver WHERE id=:id AND license_number=:license")
    Optional<Driver> rawfindByIdAndLicenseNumber(long id, String license);// runtime error thorw

    @Query("SELECT d FROM Driver d WHERE d.id = :id AND d.name = :name")
    Optional<Driver> hqlfindByIdAndName(long id, String name);// comiple time error


}
