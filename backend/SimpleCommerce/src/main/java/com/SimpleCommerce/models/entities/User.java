package com.SimpleCommerce.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String name_user;
    private String cpf;

    public User(){
    }

    public User(Long id_user, String name_user, String cpf) {
        this.id_user = id_user;
        this.name_user = name_user;
        this.cpf = cpf;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id_user, user.id_user) && Objects.equals(name_user, user.name_user) && Objects.equals(cpf, user.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_user, name_user, cpf);
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", name_user='" + name_user + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
