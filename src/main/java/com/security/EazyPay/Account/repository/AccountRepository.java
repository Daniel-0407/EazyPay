package com.security.EazyPay.Account.repository;

import com.security.EazyPay.Account.dto.Account;
import com.security.EazyPay.Account.dto.request.CreateAccountRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    @Query(value = "")
    void addAccount(CreateAccountRequest request);
}
