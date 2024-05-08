package cue.edu.co.mapping.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserDto(Integer user_id, String username, String password, String email, String full_name) {
}
