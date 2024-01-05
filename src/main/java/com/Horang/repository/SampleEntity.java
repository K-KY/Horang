package com.Horang.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "sample")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String region;

    public SampleEntity(String name, Integer age, String region) {
        this.name = name;
        this.age = age;
        this.region = region;
    }
}
