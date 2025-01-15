package org.example.uberreviewservice.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name="passenger_review_id")
public class PassengerReview extends Review{


    private String passengerReviewcontent;

}
