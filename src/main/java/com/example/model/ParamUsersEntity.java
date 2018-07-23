package com.example.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "param_users", schema = "test")
public class ParamUsersEntity {
    private long id;
    private Timestamp createdDate;
    private String nameParam;
    private String valueParam;
    private String email;
    private Integer userId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created_date", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "name_param", nullable = true, length = 255)
    public String getNameParam() {
        return nameParam;
    }

    public void setNameParam(String nameParam) {
        this.nameParam = nameParam;
    }

    @Basic
    @Column(name = "value_param", nullable = true, length = 255)
    public String getValueParam() {
        return valueParam;
    }

    public void setValueParam(String valueParam) {
        this.valueParam = valueParam;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParamUsersEntity that = (ParamUsersEntity) o;
        return id == that.id &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(nameParam, that.nameParam) &&
                Objects.equals(valueParam, that.valueParam) &&
                Objects.equals(email, that.email) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, createdDate, nameParam, valueParam, email, userId);
    }
}
