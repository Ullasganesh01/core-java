package com.xworkz.mall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "shops")
public class ShopsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;
    private String shopName;
    private String shopType;
}
