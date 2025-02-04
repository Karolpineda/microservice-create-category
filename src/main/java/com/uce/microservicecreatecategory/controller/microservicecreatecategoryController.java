package com.uce.microservicecreatecategory.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.microservicecreatecategory.model.Category;
import com.uce.microservicecreatecategory.repository.microservicecreatecategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class microservicecreatecategoryController {

    @Autowired
    private microservicecreatecategoryRepository microservicecreatecategoryRepository;

    // Endpoint Health para verificar si el microservicio está activo
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Microservicio Create Category está en funcionamiento");
    }

    // Crear una nueva categoría
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        category.setId(UUID.randomUUID());  // Asegurarse de que se genere un UUID automáticamente
        Category newCategory = microservicecreatecategoryRepository.save(category);
        return ResponseEntity.ok(newCategory);
    }

    // Obtener una categoría por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable UUID id) {
        Optional<Category> category = microservicecreatecategoryRepository.findById(id);
        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
        }
        return ResponseEntity.notFound().build();
    }
}
