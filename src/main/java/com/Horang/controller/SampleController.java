package com.Horang.controller;


import com.Horang.controller.response.SampleRes;
import com.Horang.repository.SampleDto;
import com.Horang.repository.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    private final SampleService service;

    @Autowired
    public SampleController(SampleService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<SampleRes> getSample(@RequestParam("name") String name) {
        SampleRes response = new SampleRes("Hello " + name);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello/member")
    public SampleDto getSampleDto() {
        return service.findById(1L);
    }


}
