package com.example.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to automatically generate the primary key values
    @Column(name="customer_id") //just for reference, will work without this as well
    private Long customerId;

    private String email;

    private String name;

    private String mobileNumber;
}
