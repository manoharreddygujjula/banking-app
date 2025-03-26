package net.manohar.banking.service;

import net.manohar.banking.dto.AccountDto;
import net.manohar.banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAccountHolders();

    void deleteAccount(Long id);
}
