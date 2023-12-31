package com.Horang.repository;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private final SampleRepository repository;

    public SampleService(SampleRepository repository) {
        this.repository = repository;
        repository.save(new SampleEntity("규영", 24, "인천"));
    }

    public SampleDto findById(Long id) {
        return SampleDto.of(repository.findById(1L));
    }
}
