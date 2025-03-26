package net.manohar.banking.mapper;

import net.manohar.banking.dto.AccountDto;
import net.manohar.banking.entity.Account;

import java.util.AbstractCollection;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account= new Account(accountDto.getId(),accountDto.getAccountHolderName(),accountDto.getBalance());
        return account;
    }

    public static AccountDto maptoAccountDto(Account account){
        AccountDto accountDto=new AccountDto(account.getId(),account.getAccountHolderName(),account.getBalance());
        return accountDto;
    }
}
