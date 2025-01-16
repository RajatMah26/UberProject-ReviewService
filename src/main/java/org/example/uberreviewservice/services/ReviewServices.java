package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Driver;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepositories;
import org.example.uberreviewservice.repositories.DriverRepository;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {

    private final BookingRepositories bookingRepositories;
    private final DriverRepository driverRepository;
    private ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository, BookingRepositories bookingRepositories, DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepositories = bookingRepositories;
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("*****************");

//        Review r=Review.builder()
//                .content("Amazing ride quality")
//                .rating(5.0)
//                .build();
////                .createdA(new Date())
////                .updatedA(new Date())
//
//
//        Booking b= Booking
//                .builder()
//                .review(r)
//                .endTime(new Date())
//                .build();
//
//        //reviewRepository.save(r);//this code exectude sql query
//        bookingRepositories.save(b);

//        List<Review> reviews=reviewRepository.findAll();
//
//        for(Review review:reviews){
//            System.out.println(r.getContent());
//        }   Fetch data


//        Optional<Booking> b=bookingRepositories.findById(6L);
//        if(b.isPresent()){
//            bookingRepositories.delete(b.get());
//        }


        //reviewRepository.deleteAllById(2l);
       // List<Driver> drivers=driverRepository.findAll();

//        Optional<Driver> drivers = driverRepository.findById(1L);
//         if(drivers.isPresent()){
//             System.out.println(drivers.get().getName());
//             List<Booking> b=drivers.get().getBookings();
////             List<Booking> bookings=bookingRepositories.findAllByDriverId(1L);
//             for(Booking booking:b){
//                 System.out.print(booking.getId());
//             }
//         }
//
//         Optional<Booking> b=bookingRepositories.findById(1L);



        Optional<Driver> d = driverRepository.hqlfindByIdAndName(1L, "ABCD");
        if (d.isPresent()) {
            System.out.println(d.get().getName());
        } else {
            System.out.println("Driver not found");
        }








    }
}
