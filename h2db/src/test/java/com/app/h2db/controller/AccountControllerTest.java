//package com.app.h2db.controller;
//
//import com.app.h2db.entity.Account02;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
////import org.junit.platform.runner.JUnitPlatform;
//
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
////@RunWith(JUnitPlatform.class)
//public class AccountControllerTest {
//
//    @InjectMocks
//    AccountController  employeeController;
//
//    @Test
//    public void testAddEmployee()
//    {
//        MockHttpServletRequest request = new MockHttpServletRequest();
//        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
//
//       // when(employeeDAO.addEmployee(any(Employee.class))).thenReturn(true);
//
//       // Employee employee = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
//        ResponseEntity<Account02> responseEntity = employeeController.getHello();
//        System.out.println(" responseEntity>>>"+responseEntity);
//
//    }
//
//}
