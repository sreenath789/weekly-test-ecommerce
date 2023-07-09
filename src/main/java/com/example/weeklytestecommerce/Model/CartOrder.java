package com.example.weeklytestecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="cart_order")
public class CartOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int productQuantity;
    @OneToOne
    User user;
    @OneToOne
    Address address;
    @OneToOne
    Product product;
}
