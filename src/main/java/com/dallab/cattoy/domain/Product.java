package com.dallab.cattoy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.NumberFormat;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String name;

    @Getter
    private String maker;

    private Integer price;

    private String imageUrl;

    public String getPriceWithComma() {
        return NumberFormat.getInstance().format(price);
    }

    public String getImageUrl() {
        return imageUrl == null ? "" : imageUrl;
    }

    public void changeImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
