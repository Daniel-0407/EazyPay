package com.security.EazyPay.Account.dto;

import com.security.EazyPay.Account.AccountType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;

@Entity
@RequiredArgsConstructor
@Table(name = "Account")
@Getter
@Setter
public class Account {
    @Id
    @GenericGenerator(name = "id")
    private String id;
    @Column(name = "number", nullable = false)
    @GenericGenerator(name = "number")
    private String number;
    @Column(name = "owner", nullable = false)
    private String owner;
    @Column(name = "type", nullable = false)
    private AccountType type;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

}
