package cue.edu.co.mapping.dtos;

import lombok.Builder;

import java.util.Date;

@Builder
public record ReservationDto(Integer reservation_id, Integer vehicle_id, Date start_date, Date end_date, double total_cost, String state) {
}