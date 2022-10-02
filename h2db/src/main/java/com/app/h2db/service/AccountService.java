package com.app.h2db.service;

import com.app.h2db.entity.Account02;
import com.app.h2db.repository.AccountRepository;
import com.app.h2db.service.helper.AccountServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

      @Autowired
      AccountRepository accountRepository;

      @Autowired
      AccountServiceHelper accountServiceHelper;

    public List<Account02> getAllAccounts(){
        System.out.println(" getAllAccounts >>>>> ");
        List<Account02> account02s=accountRepository.findAll();
        System.out.println(" >>>>>"+account02s.size());
        for(Account02 account02:account02s){
            System.out.println(" Account >>>>:"+account02.toString());
        }
        return account02s;
    }
//    public void saveAccountNew(Account02 account02){
//        account02.setAccountStatus("true");
//        account02.setAccountType("Savingd");
//        accountServiceHelper.saveAccountNew(account02);
//    }
//
//
//    public Account02 hello(){
//
//          Account02 account021=new Account02();
//          account021.setCurrency("doller");
//          account021.setPwAccountId("12333");
//
//          return account021;
//      }
//
//
//
//    public Account02  getAccountByPWaccuntID(String pwaccountid){
//        System.out.println(">getAccountByPWaccuntID  pwaccountid>>>>"+pwaccountid);
//        Account02 account02=  accountRepository.findByPwAccountId(pwaccountid);
//        System.out.println(">getAccountByPWaccuntID>>>>"+account02);
//        System.out.println(">getAccountByPWaccuntID>>>>>>>>>>>"+account02.getAccountHistory02List());
//        System.out.println(" ###3 getIdentity02List>>>>"+account02.getIdentity02List());
//        System.out.println(">>>getPwAccountId>>>> "+account02.getIdentity02List().get(0).getPwAccountId().getPwAccountId());
//        return account02;
//    }
//      public Optional<Account02> getAccount(int num){
//          Optional<Account02> account02=  accountRepository.findById(num);
//          System.out.println(">>>>>"+account02);
//          System.out.println(">>>>>>>>>>>>"+account02.get().getAccountHistory02List());
//          return account02;
//      }
//
//
//
//    public void saveAccount(String pwAccountId){
//        Account02 acc=new Account02();
//        acc.setAccountNumber("TestACC");
//        acc.setAccountStatus("stst");
//        acc.setBankName("SBI");
//        acc.setLinkTokenId("LinkToken");
//        acc.setCurrency("RS");
//        long now = System.currentTimeMillis();
//        Timestamp sqlTimestamp = new Timestamp(now);
//
//         acc.setPwAccountId(pwAccountId);
//         acc.setCreatedAt(sqlTimestamp);
//
//        AccountHistory02 accountHistory02=new AccountHistory02();
//        accountHistory02.setAccountNumber("eeee");
//        accountHistory02.setBankName("test");
//        accountHistory02.setCurrency("Doller");
//        accountHistory02.setPwAccountId(acc);
//        accountHistory02.setCreatedAt(sqlTimestamp);
//        System.out.println(" >>>>>"+accountHistory02.getPwAccountId());
//
//        List<AccountHistory02> accountHistory02List=new ArrayList<>();
//        accountHistory02List.add(accountHistory02);
//        acc.setAccountHistory02List(accountHistory02List);
//
//        Identity02 identity02=new Identity02();
//        identity02.setEmails("vinaymcu@gmail.com");
//        identity02.setFullName("VinayGupta111");
//        identity02.setLinkTokenId("SBI111");
//        identity02.setEndUserId("insureID1111");
//        identity02.setPwAccountId(acc); //forein key
//
//        List<Identity02> Identity02List=new ArrayList<>();
//        Identity02List.add(identity02);
//        acc.setIdentity02List(Identity02List);
//
//        Account02 aaa=  accountRepository.save(acc);
//        System.out.println("AFERT PERSIST REPOSITORY>>>>>>>>>"+aaa);
//    }

}
