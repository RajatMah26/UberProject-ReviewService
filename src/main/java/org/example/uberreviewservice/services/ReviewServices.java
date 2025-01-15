package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepositories;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {

    private final BookingRepositories bookingRepositories;
    private ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository, BookingRepositories bookingRepositories) {
        this.reviewRepository = reviewRepository;
        this.bookingRepositories = bookingRepositories;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("*****************");

        Review r=Review.builder()
                .content("Amazing ride quality")
                .rating(5.0)
                .build();
//                .createdA(new Date())
//                .updatedA(new Date())


        Booking b= Booking
                .builder()
                .review(r)
                .endTime(new Date())
                .build();

        //reviewRepository.save(r);//this code exectude sql query
        bookingRepositories.save(b);

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
    }
}
