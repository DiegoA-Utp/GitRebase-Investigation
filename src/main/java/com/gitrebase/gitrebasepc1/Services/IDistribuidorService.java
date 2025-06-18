package com.gitrebase.gitrebasepc1.Services;

import java.util.List;

import com.gitrebase.gitrebasepc1.Models.entities.Distrubuidor;

public interface IDistribuidorService {

    Distrubuidor getDistribuidorById(Long id);

    List<Distrubuidor> getAllDistribuidor();

    Distrubuidor addDistribuidor(Distrubuidor distribuidor);

    Distrubuidor updateDistribuidor(Distrubuidor distribuidor);

    void deleteDistribuidor(Long id);

    Distrubuidor findByNombre(String nombre);

}
