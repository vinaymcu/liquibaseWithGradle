package com.app.h2db.controller;

import com.app.h2db.entity.Account02;
import com.app.h2db.model.Account;
import com.app.h2db.model.AppResponse;
import com.app.h2db.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("account/all")
    public ResponseEntity<Account>  hello(){

        System.out.println(" aaa >>>>>>>>>>>>>>>>>");
        List<Account02> aa=accountService.getAllAccounts();
        Account account=new Account();
        account.setPwAccountId("12345");
        account.setAccountType("SAving");
        account.setLinkTokenId("testLinked");
        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
        return response;

    }
//    @GetMapping("account/get/{id}")
//    @ResponseBody
//    public ResponseEntity<Account> getAccount(@PathVariable("id") Integer id){
//        System.out.println(" <<<<<<<<<get >>>>>>>>>>"+id);
//        Account account=new Account();
//        account.setPwAccountId("12345");
//        account.setAccountType("SAving");
//        account.setLinkTokenId("testLinked");
//        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
//
//
//        return response;
//
//    }

//    @GetMapping("account/all")
//       public ResponseEntity<Account>  hello(){
//
//        System.out.println(" aaa >>>>>>>>>>>>>>>>>");
//        //Account02 aa=accountService.hello();
//        Account account=new Account();
//        account.setPwAccountId("12345");
//        account.setAccountType("SAving");
//        account.setLinkTokenId("testLinked");
//        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
//        return response;
//
//    }
//
//    @GetMapping("account/get/pwaccountid/{pwaccountid}")
//    @ResponseBody
//    public Optional<Account02> getAccountByPWaccuntID(@PathVariable("pwaccountid") String pwaccountid){
//        System.out.println(" pwaccountid >>>>>>>>>>"+pwaccountid);
//        Account02 aa=accountService.getAccountByPWaccuntID(pwaccountid);
//        System.out.println(" aaa >>>>>>>>>>>>>>>>>");
//        return null;
//
//    }
//    @PostMapping("account/save")
//    @ResponseBody
//    public ResponseEntity<AppResponse> saveAccountNew() {
//        System.out.println("saveAccount Title >>>>>>>>>>>>>>>>" );//account model
//        Random rand= new Random();
//        int rr=rand.nextInt();
//       // String pw="testPW";
//        Account02 account=new Account02();
//        account.setPwAccountId("123"+rr);
//        account.setAccountNumber("88"+rr);
//        account.setCurrency("rs");
//        account.setBankName("sbi");
//        accountService.saveAccountNew(account);
//
//        AppResponse appResponse = new AppResponse();
//        appResponse.setStatusCode("200");
//
//        return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
//
//    }
//    @PostMapping("account/save")
//    @ResponseBody
//    public ResponseEntity<AppResponse> saveAccount() {
//        System.out.println("saveAccount Title >>>>>>>>>>>>>>>>" );//account model
//        Random rand= new Random();
//        int rr=rand.nextInt();
//        String pw="testPW";
//        Account02 account=new Account02();
//        account.setPwAccountId("123"+rr);
//        account.setAccountNumber("88"+rr);
//        account.setCurrency("rs");
//        account.setBankName("sbi");
//        accountService.saveAccount(pw+rr);
//    // System.out.println("After Successfully save id is " + art.getArticleId());
//
//        AppResponse appResponse = new AppResponse();
//        appResponse.setStatusCode("200");
//        //appResponse.setStatusCode(HttpStatus.OK.name());
//        //appResponse.setMessage("Create/Update Article is " + art.getArticleId());
//
//        return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
//
//    }
}
