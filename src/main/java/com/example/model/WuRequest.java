package com.example.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;

@Entity
@Table(name = "wu_request")
public class WuRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "amount")
    private String amount;
    @Column(name = "currency")
    @NotNull
    @NotNull
    @Pattern(regexp="^(?=\\s*\\S).*$", message=" *Необхідно вибрати валюту переказу")
    private String currency;
    @Column(name = "amount_send")
    @NotNull(message = " *Необхідно ввести суму")
    @Pattern(regexp = "^[0-9]*\\.[0-9]{2}", message=" *Необхідно ввести суму у форматі число з роздільником крапка (Наприклад - 15.00)")
    private String amountSend;
    @Column(name = "cooment")
    private String cooment;

    @Column(name = "email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_request", nullable = true, insertable = true, updatable = true)
    private  java.util.Date dateRequest;


    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",nullable=false, updatable=false)
    private User primaryUser;


    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id",nullable=false, updatable=false)
     private DicState primaryState;

    public DicState getPrimaryState() {
        return primaryState;
    }

    public void setPrimaryState(DicState primaryState) {
        this.primaryState = primaryState;
    }


    public User getPrimaryUser() {
        return primaryUser;
    }

    public void setPrimaryUser(User primaryUser) {
        this.primaryUser = primaryUser;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "currency", nullable = true, length = 3)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "amount_send", nullable = false, length = 255)
    public String getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(String amountSend) {
        this.amountSend = amountSend;
    }

    @Basic
    @Column(name = "cooment", nullable = true, length = 255)
    public String getCooment() {
        return cooment;
    }

    public void setCooment(String cooment) {
        this.cooment = cooment;
    }

    /* @Basic
     @Column(name = "user_id", nullable = true)
     public Integer getUserId() {
         return userId;
     }
     public void setUserId(Integer userId) {
         this.userId = userId;
     }*/
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* @Basic
     @Column(name = "userid", nullable = true)
     public Integer getUserid() {
         return userid;
     }
     public void setUserid(Integer userid) {
         this.userid = userid;
     }
 */
    @Temporal(TemporalType.DATE)
    @Column(name = "date_request", nullable = true, insertable = true, updatable = true)
    public  java.util.Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(java.util.Date dateRequest) {
        this.dateRequest = dateRequest;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WuRequest wuRequest = (WuRequest) o;
        return id == wuRequest.id &&
                Objects.equals(amount, wuRequest.amount) &&
                Objects.equals(currency, wuRequest.currency) &&
                Objects.equals(amountSend, wuRequest.amountSend) &&
                Objects.equals(cooment, wuRequest.cooment) &&
                Objects.equals(userId, wuRequest.userId) &&
                Objects.equals(email, wuRequest.email) &&
                Objects.equals(dateRequest, wuRequest.dateRequest);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, amount, currency,  email, dateRequest, amountSend, cooment, userId);
    }
*/
}