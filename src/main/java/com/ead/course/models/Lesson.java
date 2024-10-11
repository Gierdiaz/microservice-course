package com.ead.course.models;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "lessons")
public class Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID lessonId;
    
    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false, length = 250)
    private String descString;

    @Column
    private String videoUrl;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createdAt;
}
