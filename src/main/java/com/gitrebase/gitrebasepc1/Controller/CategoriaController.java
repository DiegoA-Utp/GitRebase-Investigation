package com.gitrebase.gitrebasepc1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gitrebase.gitrebasepc1.Models.entities.Categoria;
import com.gitrebase.gitrebasepc1.Services.ICategoriaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/categoria")
    public List<Categoria> getAll() {
        return categoriaService.getAll();
    }

    @PostMapping("/categoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria Create(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @GetMapping("/categoria/{id}")
    public Categoria getCategoriaId(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

    @DeleteMapping("/categoria/{id}")
    public void delete(@PathVariable Long id) {
        categoriaService.delete(categoriaService.findById(id));
    }

}
