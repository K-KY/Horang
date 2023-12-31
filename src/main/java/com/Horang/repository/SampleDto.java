package com.Horang.repository;

import lombok.Getter;

@Getter
public class SampleDto {
    private final String name;
    private final Integer age;
    private final String region;

    public SampleDto(SampleEntity entity) {
        this.name = entity.getName();
        this.age = entity.getAge();
        this.region = entity.getRegion();
    }

    static public SampleDto of(SampleEntity sampleEntity) {
        SampleDto sampleDto = new SampleDto(sampleEntity);
        return sampleDto;
    }
}
