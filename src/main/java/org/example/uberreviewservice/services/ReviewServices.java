package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
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


        reviewRepository.save(r);//this code exectude sql query


//        List<Review> reviews=reviewRepository.findAll();
//
//        for(Review review:reviews){
//            System.out.println(r.getContent());
//        }   Fetch data



        //reviewRepository.deleteAllById(2l);
    }
}
