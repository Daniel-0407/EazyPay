package com.security.EazyPay.Account.dto.request;

import com.security.EazyPay.Account.AccountType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CreateAccountRequest {
    private String owner;
    private AccountType type;
}
