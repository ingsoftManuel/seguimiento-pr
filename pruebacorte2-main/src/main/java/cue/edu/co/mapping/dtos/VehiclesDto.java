package cue.edu.co.mapping.dtos;
import lombok.Builder;

@Builder
public record VehiclesDto(Long id, String name, String type, int price, boolean available) {
}