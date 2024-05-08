package cue.edu.co.mapping.mappers;

import cue.edu.co.mapping.dtos.UserDto;
import cue.edu.co.models.User;

public class MapperUser {
    public static UserDto mapFrommodel(User user){
        return new UserDto(user.getId(), user.getUsername(), user.getPassword(), user.getEmail(), user.getFull_name());
    }
    private static User mapFromdto(UserDto userDto){
        return User.builder()
                .id(userDto.user_id())
                .username(userDto.username())
                .password(userDto.password())
                .email(userDto.email())
                .full_name(userDto.full_name())
                .build();
    }
}
