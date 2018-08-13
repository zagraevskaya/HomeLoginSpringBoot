package com.example.model;

import javax.persistence.*;
import java.util.Objects;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "wu_request")
public class WuRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "amount")
    @NotNull(message = " *Необхідно ввести суму")
    @Pattern(regexp = "^[0-9]*\\.[0-9]{2}", message=" *Необхідно ввести суму у форматі число з роздільником крапка (Наприклад - 15.00)")
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


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public String getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(String amountSend) {
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
