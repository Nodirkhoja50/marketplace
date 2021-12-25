package com.example.marketplace.Product.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )

    private Integer id;
    private String name;
    private String groups;
    private float discountedPrice;

    public Product() {
    }

    public Product( String name, String groups, float discountedPrice) {
        this.name = name;
        this.groups = groups;
        this.discountedPrice = discountedPrice;
    }


    public Product(Integer id, String name, String group, float discountedPrice) {
        this.id = id;
        this.name = name;
        this.groups = groups;
        this.discountedPrice = discountedPrice;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return groups;
    }

    public void setGroup(String groups) {
        this.groups = groups;
    }

    public float getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + groups + '\'' +
                ", discountedPrice=" + discountedPrice +
                '}';
    }
}
