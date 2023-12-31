package com.Horang.repository;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private final SampleRepository repository;
    @Autowired
    public SampleService(SampleRepository repository) {

        this.repository = repository;
        repository.save(new SampleEntity("규영", 24, "인천"));
    }

    public SampleEntity findById(String id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
