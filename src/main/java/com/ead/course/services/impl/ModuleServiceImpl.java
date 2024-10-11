package com.ead.course.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleSerivce;

@Service
public class ModuleServiceImpl implements ModuleSerivce{
    
    @Autowired
    ModuleRepository moduleRepository;
}
