package com.app.h2db.service;

import com.app.h2db.entity.Account02;
import com.app.h2db.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AccountServiceTest.class)
public class AccountServiceTest {

    //@InjectMocks
   // EmployeeManager manager;
    //@MockBean
    @InjectMocks
    private AccountService accountService;

    @MockBean
    AccountRepository accountRepository;

    //@Test
    public void testSaveOrUpdateEmployee() throws Exception {
       // Account02 employee = getEmployee();
       // doNothing().when(accountRepository).save(employee);
        //accountService.saveAccountNew(employee);
        assertTrue(true);
    }
//    private Account02 getEmployee() {
//        Account02 account02 = new Account02();
//        account02.setPwAccountId("1");
//        account02.setBankName("sbi");
//        account02.setCurrency("rs");
//        account02.setAccountNumber("acc");
//        return account02;
//    }
}
