package com.ead.course.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.course.models.Module;

public interface ModuleRepository extends JpaRepository<Module, UUID> {
    
}
