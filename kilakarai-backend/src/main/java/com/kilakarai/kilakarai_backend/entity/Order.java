package com.kilakarai.kilakarai_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SNACK_ORDERS")
public class Order {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_seq"
    )
    @SequenceGenerator(
            name = "order_seq",
            sequenceName = "snack_order_seq",
            allocationSize = 1
    )
    private Long id;


    @Column(name = "customer_name")
    private String customerName;

    private String phone;

    private String address;


    @Column(name = "total_amount")
    private Double totalAmount;


    public Order() {

    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id=id;
    }


    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone=phone;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address=address;
    }


    public Double getTotalAmount() {
        return totalAmount;
    }


    public void setTotalAmount(Double totalAmount) {
        this.totalAmount=totalAmount;
    }
}