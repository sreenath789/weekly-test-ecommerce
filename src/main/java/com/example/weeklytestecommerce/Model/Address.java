package com.example.weeklytestecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String landMark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
