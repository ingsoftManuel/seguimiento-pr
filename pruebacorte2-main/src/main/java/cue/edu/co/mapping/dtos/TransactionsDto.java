package cue.edu.co.mapping.dtos;

import lombok.Builder;


@Builder
public record TransactionsDto(Integer id, double amount, String PaymentMethod) {
}