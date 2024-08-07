package com.project.practice.service;

import com.project.practice.model.Scheme;
import com.project.practice.repository.SchemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchemeService {

    @Autowired
    private SchemeRepository schemeRepository;

    public List<Scheme> getAllSchemes() {
        return schemeRepository.findAll();
    }

    public Scheme addScheme(Scheme scheme) {
        return schemeRepository.save(scheme);
    }

    public Scheme updateScheme(Scheme scheme) {
        return schemeRepository.save(scheme);
    }

    public void deleteScheme(Long id) {
        schemeRepository.deleteById(id);
    }
}
