package com.Horang.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "sample")
@AllArgsConstructor
@NoArgsConstructor
public class SampleEntity {
    @Id
    private String name;
    private Integer age;
    private String region;
}
