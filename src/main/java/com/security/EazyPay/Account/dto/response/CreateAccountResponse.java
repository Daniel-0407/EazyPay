package com.security.EazyPay.Account.dto.response;

import com.security.EazyPay.Account.AccountType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Data
public class CreateAccountResponse {
    private String number;
    private String owner;
    private AccountType type;
    private Instant createdAt;
}
