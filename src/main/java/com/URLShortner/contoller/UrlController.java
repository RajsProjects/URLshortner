package com.URLShortner.contoller;

import com.URLShortner.dto.CreateUrlRequest;
import com.URLShortner.dto.CreateUrlResponse;
import com.URLShortner.service.UrlService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    private final UrlService urlService;
//constructor injection
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/api/urls")
    public CreateUrlResponse createUrl(@RequestBody CreateUrlRequest request) {
        return urlService.createShortUrl(request);
    }

}
