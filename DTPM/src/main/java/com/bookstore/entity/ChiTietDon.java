package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ChiTietDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Don order;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Sach sach;

    private Integer quantity;
    private Double price;
}
