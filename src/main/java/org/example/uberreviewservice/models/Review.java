package org.example.uberreviewservice.models;


import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "bookingReview")
public class Review {

    @Id// this anntaiona make the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identiny means auto incremeant
    private Long id;

    @Column(nullable = false)
    private String content;


    private Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this tell spring about the format of date what and which type store
    @CreatedDate        // this tell spring that only handle for object creation
    private Date createdA;




    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  // this tell spring that only handle for object update
    private Date updatedA;








}
