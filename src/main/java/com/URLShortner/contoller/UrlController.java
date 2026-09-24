package com.URLShortner.contoller;

import com.URLShortner.dto.CreateUrlRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/api/urls")
    public String createUrl(@RequestBody CreateUrlRequest request) {
        return request.getOriginalUrl();
    }

}
