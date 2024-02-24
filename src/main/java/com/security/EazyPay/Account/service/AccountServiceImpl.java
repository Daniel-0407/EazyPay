package com.security.EazyPay.Account.service;

import com.security.EazyPay.Account.dto.request.CreateAccountRequest;
import com.security.EazyPay.Account.dto.response.CreateAccountResponse;
import com.security.EazyPay.Account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        return null;
    }
}
