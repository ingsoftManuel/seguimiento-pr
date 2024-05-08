package cue.edu.co.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Vehicles {
    private Long id;
    private String name;
    private String type;
    private int price;
    private boolean available;


}
