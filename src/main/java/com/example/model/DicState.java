package com.example.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "dic_state", schema = "test")
public class DicState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "id", nullable = false)
    private String nameState;

    @OneToMany(mappedBy = "primaryState")
    private Set<WuRequest> allWuRequest;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_state", nullable = false, length = 255)
    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicState dicState = (DicState) o;
        return id == dicState.id &&
                Objects.equals(nameState, dicState.nameState);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nameState);
    }
}
