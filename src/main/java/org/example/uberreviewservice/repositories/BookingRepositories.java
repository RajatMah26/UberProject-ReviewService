package org.example.uberreviewservice.repositories;


import org.example.uberreviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepositories extends JpaRepository<Booking,Long> {


    List<Booking> findAllByDriverId(Long driverid);

}
