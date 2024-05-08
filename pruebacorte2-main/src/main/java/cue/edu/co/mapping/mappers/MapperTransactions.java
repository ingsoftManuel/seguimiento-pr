package cue.edu.co.mapping.mappers;

import cue.edu.co.mapping.dtos.TransactionsDto;
import cue.edu.co.models.Transactions;

public class MapperTransactions {
    public static TransactionsDto mapFrommodel (Transactions transactions){
        return new TransactionsDto(transactions.getId(), transactions.getAmount(), transactions.getPaymentMethod());
    }
    private static Transactions mapFromdto (TransactionsDto transactionsDto){
        return Transactions.builder()
                .id(transactionsDto.id())
                .amount(transactionsDto.amount())
                .PaymentMethod(transactionsDto.PaymentMethod())
                .build();
    }
}
