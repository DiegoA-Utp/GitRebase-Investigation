package com.gitrebase.gitrebasepc1.Controller;

import com.gitrebase.gitrebasepc1.Models.entities.Venta;
import com.gitrebase.gitrebasepc1.Services.IVentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    private final IVentaService ventaService;

    public VentaController(IVentaService ventaService){
        this.ventaService=ventaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable Long id){
        return ResponseEntity.ok(ventaService.getVentaById(id));
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getAllVenta(){
        return ResponseEntity.ok(ventaService.getAllVentas());
    }

    @PostMapping
    public ResponseEntity<Venta> createVenta(@RequestBody Venta venta){
        return ResponseEntity.status(HttpStatus.CREATED).body(ventaService.createVenta(venta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id,@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.updateVenta(id,venta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Long id){
        ventaService.deleteVenta(id);
        return ResponseEntity.noContent().build();
    }
}
