package org.example.dao.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import javax.annotation.processing.Generated;

public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
}
