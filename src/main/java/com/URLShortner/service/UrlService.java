package com.URLShortner.service;

import com.URLShortner.dto.CreateUrlRequest;
import com.URLShortner.dto.CreateUrlResponse;
import com.URLShortner.generator.ShortCodeGenerator;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    private final ShortCodeGenerator shortCodeGenerator;

    public UrlService(ShortCodeGenerator shortCodeGenerator) {
        this.shortCodeGenerator = shortCodeGenerator;
    }

    public CreateUrlResponse createShortUrl(CreateUrlRequest request) {
        String shortCode = shortCodeGenerator.generate();
        System.out.println("Generated Short Code: " + shortCode);
        return null;
    }
}