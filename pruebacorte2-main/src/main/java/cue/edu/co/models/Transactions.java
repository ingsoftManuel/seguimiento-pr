package cue.edu.co.models;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Transactions {
    private Integer id;
    private double amount;
    private String PaymentMethod;
}
