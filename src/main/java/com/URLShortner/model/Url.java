package com.URLShortner.model;

import jakarta.persistence.*;

@Entity //Treat Url as a persistent entity.
@Table(name = "urls")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //Let the database generate the ID when a new row is inserted.
    private Long id;

    @Column(name = "short_code", nullable = false, unique = true)
    private String shortCode;

    @Column(name = "original_url", nullable = false)
    private String originalUrl;
}
