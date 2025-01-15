package org.example.uberreviewservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passanger extends BaseModel{
    private String name;


    @OneToMany(mappedBy = "passanger")
    private List<Booking> bookings=new ArrayList<>();
}
