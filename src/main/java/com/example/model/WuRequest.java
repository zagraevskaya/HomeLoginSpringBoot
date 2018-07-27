package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wu_request")
public class WuRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @Column(name = "amount")
    private Double amount;

    @Column(name = "currency")
    private String currency;
    @Column(name = "amount_send")
    private Double amountSend;

    @Column(name = "cooment")
    private String cooment;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "email")
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public Double getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(Double amountSend) {
        this.amountSend = amountSend;
    }


    public String getCooment() {
        return cooment;
    }

    public void setCooment(String cooment) {
        this.cooment = cooment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
