package com.security.EazyPay.Account.controller;

import com.security.EazyPay.Account.dto.Account;
import com.security.EazyPay.Account.dto.request.CreateAccountRequest;
import com.security.EazyPay.Account.dto.response.CreateAccountResponse;
import com.security.EazyPay.Account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/account")
@RequiredArgsConstructor
public class AccountController {
    private AccountService accountService;

    @PostMapping(name = "/createNew")
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        return accountService.createAccount(request);
    }
}
