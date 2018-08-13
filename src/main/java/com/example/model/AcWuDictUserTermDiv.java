package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ac_wu_dict_user_term_div")
public class AcWuDictUserTermDiv {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "wrk_id", nullable = true)
    private Integer wrkId;
    @Column(name = "div_id", nullable = true)
    private Integer divId;
    @Column(name = "tt", nullable = true)
    private Integer tt;
    @Column(name = "city", nullable = true, length = 100)
    private String city;
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Column(name = "code_usd", nullable = true, length = 9)
    private String codeUsd;
    @Column(name = "code_uah", nullable = true, length = 9)
    private String codeUah;
    @Column(name = "code_eur", nullable = true, length = 9)
    private String codeEur;
    @Column(name = "code_rub", nullable = true, length = 9)
    private String codeRub;
    @Column(name = "operator_no", nullable = true)
    private Integer operatorNo;
    @Column(name = "operator_fio", nullable = true, length = 255)
    private String operatorFio;
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Column(name = "pwd_function", nullable = true, length = 1)
    private String pwdFunction;
    @Column(name = "code_terminal", nullable = true, length = 4)
    private String codeTerminal;
    @Column(name = "info_status", nullable = true, length = 255)
    private String infoStatus;
    @Column(name = "status_id", nullable = true)
    private Integer statusId;
    @Column(name = "term_id", nullable = true)
    private Integer termId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getWrkId() {
        return wrkId;
    }

    public void setWrkId(Integer wrkId) {
        this.wrkId = wrkId;
    }


    public Integer getDivId() {
        return divId;
    }

    public void setDivId(Integer divId) {
        this.divId = divId;
    }


    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCodeUsd() {
        return codeUsd;
    }

    public void setCodeUsd(String codeUsd) {
        this.codeUsd = codeUsd;
    }


    public String getCodeUah() {
        return codeUah;
    }

    public void setCodeUah(String codeUah) {
        this.codeUah = codeUah;
    }


    public String getCodeEur() {
        return codeEur;
    }

    public void setCodeEur(String codeEur) {
        this.codeEur = codeEur;
    }

    public String getCodeRub() {
        return codeRub;
    }

    public void setCodeRub(String codeRub) {
        this.codeRub = codeRub;
    }


    public Integer getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(Integer operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getOperatorFio() {
        return operatorFio;
    }

    public void setOperatorFio(String operatorFio) {
        this.operatorFio = operatorFio;
    }

    public String getOperatorEmail() {
        return email;
    }

    public void setOperatorEmail(String email) {
        this.email = email;
    }

     public String getPwdFunction() {
        return pwdFunction;
    }

    public void setPwdFunction(String pwdFunction) {
        this.pwdFunction = pwdFunction;
    }

    public String getCodeTerminal() {
        return codeTerminal;
    }

    public void setCodeTerminal(String codeTerminal) {
        this.codeTerminal = codeTerminal;
    }

    public String getInfoStatus() {
        return infoStatus;
    }

    public void setInfoStatus(String infoStatus) {
        this.infoStatus = infoStatus;
    }

      public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }


    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcWuDictUserTermDiv that = (AcWuDictUserTermDiv) o;
        return id == that.id &&
                Objects.equals(wrkId, that.wrkId) &&
                Objects.equals(divId, that.divId) &&
                Objects.equals(tt, that.tt) &&
                Objects.equals(city, that.city) &&
                Objects.equals(address, that.address) &&
                Objects.equals(codeUsd, that.codeUsd) &&
                Objects.equals(codeUah, that.codeUah) &&
                Objects.equals(codeEur, that.codeEur) &&
                Objects.equals(codeRub, that.codeRub) &&
                Objects.equals(operatorNo, that.operatorNo) &&
                Objects.equals(operatorFio, that.operatorFio) &&
                Objects.equals(email, that.email) &&
                Objects.equals(pwdFunction, that.pwdFunction) &&
                Objects.equals(codeTerminal, that.codeTerminal) &&
                Objects.equals(infoStatus, that.infoStatus) &&
                Objects.equals(statusId, that.statusId) &&
                Objects.equals(termId, that.termId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, wrkId, divId, tt, city, address, codeUsd, codeUah, codeEur, codeRub, operatorNo, operatorFio,email, pwdFunction, codeTerminal, infoStatus, statusId, termId);
    }
}
