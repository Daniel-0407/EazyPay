package com.security.EazyPay.Account.service;

import com.security.EazyPay.Account.dto.request.CreateAccountRequest;
import com.security.EazyPay.Account.dto.response.CreateAccountResponse;

public interface AccountService {
    CreateAccountResponse createAccount(CreateAccountRequest request);
}
