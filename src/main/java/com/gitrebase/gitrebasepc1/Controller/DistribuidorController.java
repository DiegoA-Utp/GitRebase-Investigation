package com.gitrebase.gitrebasepc1.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gitrebase.gitrebasepc1.Services.IDistribuidorService;
import com.gitrebase.gitrebasepc1.Models.entities.Distrubuidor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/distribuidores")
public class DistribuidorController {

    private final IDistribuidorService distribuidorService;

    public DistribuidorController(IDistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @GetMapping
    public ResponseEntity<List<Distrubuidor>> getAllDistribuidor() {
        return ResponseEntity.ok(distribuidorService.getAllDistribuidor());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Distrubuidor> getDistribuidorById(@PathVariable Long id) {
        return ResponseEntity.ok(distribuidorService.getDistribuidorById(id));
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Distrubuidor> addDistribuidor(@RequestBody Distrubuidor distribuidor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(distribuidorService.addDistribuidor(distribuidor));
    }

    @GetMapping("/update")
    public ResponseEntity<Distrubuidor> updateDistribuidor(@RequestBody Distrubuidor distribuidor) {
        return ResponseEntity.ok(distribuidorService.updateDistribuidor(distribuidor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Distrubuidor> deleteDistribuidor(@PathVariable Long id) {
        distribuidorService.deleteDistribuidor(id);
        return ResponseEntity.noContent().build();

    }

}
