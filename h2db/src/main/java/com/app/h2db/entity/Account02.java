package com.app.h2db.entity;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @autho
 */


@Entity
@Table(name = "account", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"pw_account_id"})})
public class Account02 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_identifier")
    private Integer accountIdentifier;

    @Override
    public String toString() {
        return "Account02{" +
                "accountIdentifier=" + accountIdentifier +
                ", pwAccountId='" + pwAccountId + '\'' +
                ", linkTokenId='" + linkTokenId + '\'' +
                '}';
    }

    @Column(name = "pw_account_id")
    private String pwAccountId;

    @Column(name = "link_token_id")
    private String linkTokenId;

    public Integer getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(Integer accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(String pwAccountId) {
        this.pwAccountId = pwAccountId;
    }

    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }


//    @OneToMany(mappedBy = "pwAccountId",cascade=CascadeType.ALL)
//    private List<AccountHistory02> accountHistory02List;
//
//    public List<Identity02> getIdentity02List() {
//        return identity02List;
//    }
//
//    public void setIdentity02List(List<Identity02> iientity02List) {
//        identity02List = iientity02List;
//    }
//
//    @OneToMany(mappedBy = "pwAccountId",cascade=CascadeType.ALL)
//    private List<Identity02> identity02List;
//
//    public Account02() {
//    }
//
//    public Integer getAccountIdentifier() {
//        return accountIdentifier;
//    }
//
//    public void setAccountIdentifier(Integer accountIdentifier) {
//        this.accountIdentifier = accountIdentifier;
//    }
//
//    public String getPwAccountId() {
//        return pwAccountId;
//    }
//
//    public void setPwAccountId(String pwAccountId) {
//        this.pwAccountId = pwAccountId;
//    }
//
//
//    public String getLinkTokenId() {
//        return linkTokenId;
//    }
//
//    public void setLinkTokenId(String linkTokenId) {
//        this.linkTokenId = linkTokenId;
//    }
//
//    public String getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(String accountType) {
//        this.accountType = accountType;
//    }
//
//    public String getAllocationType() {
//        return allocationType;
//    }
//
//    public void setAllocationType(String allocationType) {
//        this.allocationType = allocationType;
//    }
//
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(String currency) {
//        this.currency = currency;
//    }
//
//    public Integer getRoutingNumber() {
//        return routingNumber;
//    }
//
//    public void setRoutingNumber(Integer routingNumber) {
//        this.routingNumber = routingNumber;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountStatus() {
//        return accountStatus;
//    }
//
//    public void setAccountStatus(String accountStatus) {
//        this.accountStatus = accountStatus;
//    }
//
//    public List<AccountHistory02> getAccountHistory02List() {
//        return accountHistory02List;
//    }
//
//    public void setAccountHistory02List(List<AccountHistory02> accountHistory02List) {
//        this.accountHistory02List = accountHistory02List;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (account02PK != null ? account02PK.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Account02)) {
//            return false;
//        }
//        Account02 other = (Account02) object;
//        if ((this.account02PK == null && other.account02PK != null) || (this.account02PK != null && !this.account02PK.equals(other.account02PK))) {
//            return false;
//        }
//        return true;
//    }

//    @Override
//    public String toString() {
//        return "com.app.h2db.entity.Account02[ account02PK=" + account02PK + " ]";
//    }
//


//    @Override
//    public String toString() {
//        return "Account02{" +
//                "accountIdentifier=" + accountIdentifier +
//                ", pwAccountId='" + pwAccountId + '\'' +
//                ", linkTokenId='" + linkTokenId + '\'' +
//                ", accountType='" + accountType + '\'' +
//                ", allocationType='" + allocationType + '\'' +
//                ", bankName='" + bankName + '\'' +
//              //  ", currency='" + currency + '\'' +
//                ", routingNumber=" + routingNumber +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
//                ", accountNumber='" + accountNumber + '\'' +
//                //", accountStatus='" + accountStatus + '\'' +
//              //  ", accountHistory02List=" + accountHistory02List +
//                '}';
//    }
}
