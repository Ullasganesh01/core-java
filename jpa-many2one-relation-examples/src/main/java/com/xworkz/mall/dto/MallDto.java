package com.xworkz.mall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mall")
public class MallDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mallName;
    private String location;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<ShopsDto> shops;
}
