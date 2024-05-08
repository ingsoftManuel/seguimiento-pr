package cue.edu.co.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Reservation {
    private Integer reservation_id;
    private Integer vehicle_id;
    private Date start_date;
    private Date end_date;
    private double total_cost;
    private String state;


}
