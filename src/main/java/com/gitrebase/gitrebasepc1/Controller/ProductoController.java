package com.gitrebase.gitrebasepc1.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.gitrebase.gitrebasepc1.Models.entities.Producto;
import com.gitrebase.gitrebasepc1.Services.IProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/producto")
    public List<Producto> getAll() {
        return productoService.getAll();
    }

    @GetMapping("/producto/{id}")
    public Object getProductoId(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto Create(@RequestBody Producto producto) {
        return productoService.save(producto);

    }

    @DeleteMapping("/producto/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(productoService.findById(id));
    }
}
