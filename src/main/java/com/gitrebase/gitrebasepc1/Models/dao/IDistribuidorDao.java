package com.gitrebase.gitrebasepc1.Models.dao;

import com.gitrebase.gitrebasepc1.Models.entities.Distrubuidor;
import org.springframework.data.repository.CrudRepository;

public interface IDistribuidorDao extends CrudRepository<Distrubuidor, Long> {
    Distrubuidor findByNombre(String nombre);

}
