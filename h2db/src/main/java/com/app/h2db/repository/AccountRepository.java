package com.app.h2db.repository;

//import com.app.h2db.entity.Account02PK;
import com.app.h2db.entity.Account02;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account02, Integer> {

     public Account02  findByPwAccountId(String pwAccountId);
}
