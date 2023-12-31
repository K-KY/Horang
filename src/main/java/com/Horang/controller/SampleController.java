package com.Horang.controller;


import com.Horang.controller.response.SampleRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<SampleRes> getSample(
            @RequestParam("name") String name
    ) {
        SampleRes response = new SampleRes("Hello " + name);
        return ResponseEntity.ok(response);
    }

}
