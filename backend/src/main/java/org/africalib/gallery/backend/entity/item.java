package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "items")
public class item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column(length = 100)
    private int price;

    @Column(length = 100)
    private int discountPer;
}
