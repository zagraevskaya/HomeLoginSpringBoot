package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wu_request", schema = "accord", catalog = "")
public class WuRequestEntity {
    private int id;
    private Double amount;
    private String currency;
    private Double amountSend;
    private String cooment;
    private Integer userId;
    private String email;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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
    @Column(name = "amount_send", nullable = true, precision = 0)
    public Double getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(Double amountSend) {
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

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WuRequestEntity that = (WuRequestEntity) o;
        return id == that.id &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(amountSend, that.amountSend) &&
                Objects.equals(cooment, that.cooment) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, amount, currency, amountSend, cooment, userId, email);
    }
}
