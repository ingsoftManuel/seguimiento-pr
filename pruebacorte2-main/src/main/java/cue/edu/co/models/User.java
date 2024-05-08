package cue.edu.co.models;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {


    private Integer id;
    private String username;
    private String password;
    private String email;
    private String full_name;


}

