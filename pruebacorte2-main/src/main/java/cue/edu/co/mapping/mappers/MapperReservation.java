package cue.edu.co.mapping.mappers;

import cue.edu.co.mapping.dtos.ReservationDto;
import cue.edu.co.models.Reservation;

public class MapperReservation {
    public static ReservationDto mapFrommodel (Reservation reservation) {
        return new ReservationDto(reservation.getReservation_id(), reservation.getVehicle_id(), reservation.getStart_date(), reservation.getEnd_date(), reservation.getTotal_cost(), reservation.getState());
    }
    private static Reservation mapFromto (ReservationDto reservationDto) {
        return Reservation.builder()
                .reservation_id(reservationDto.reservation_id())
                .vehicle_id(reservationDto.vehicle_id())
                .start_date(reservationDto.start_date())
                .end_date(reservationDto.end_date())
                .total_cost(reservationDto.total_cost())
                .state(reservationDto.state())
                .build();
    }
}
