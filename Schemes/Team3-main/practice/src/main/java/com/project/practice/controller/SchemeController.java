package com.project.practice.controller;

import com.project.practice.model.Scheme;
import com.project.practice.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schemes")
@CrossOrigin(origins = "http://localhost:3000")  // Adjust the port if your React app runs on a different port
public class SchemeController {

    @Autowired
    private SchemeService schemeService;

    @GetMapping
    public List<Scheme> getAllSchemes() {
        return schemeService.getAllSchemes();
    }

    @PostMapping
    public Scheme addScheme(@RequestBody Scheme scheme) {
        return schemeService.addScheme(scheme);
    }

    @PutMapping("/{id}")
    public Scheme updateScheme(@PathVariable Long id, @RequestBody Scheme scheme) {
        scheme.setId(id);
        return schemeService.updateScheme(scheme);
    }

    @DeleteMapping("/{id}")
    public void deleteScheme(@PathVariable Long id) {
        schemeService.deleteScheme(id);
    }
}
