package com.gitrebase.gitrebasepc1.Services.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.gitrebase.gitrebasepc1.Models.dao.IDistribuidorDao;
import com.gitrebase.gitrebasepc1.Models.entities.Distrubuidor;
import com.gitrebase.gitrebasepc1.Services.IDistribuidorService;

import java.util.List;

@Service
public class DistribuidorServiceImpl implements IDistribuidorService {

    @Autowired
    private IDistribuidorDao distribuidorDao;

    @Override
    public Distrubuidor getDistribuidorById(Long id) {
        return distribuidorDao.findById(id).orElse(null);
    }

    @Override
    public List<Distrubuidor> getAllDistribuidor() {
        List<Distrubuidor> distribuidores = new java.util.ArrayList<>();
        distribuidorDao.findAll().forEach(distribuidores::add);
        return distribuidores;
    }

    @Override
    public Distrubuidor findByNombre(String nombre) {
        return distribuidorDao.findByNombre(nombre);
    }

    @Override
    public Distrubuidor addDistribuidor(Distrubuidor distribuidor) {
        return distribuidorDao.save(distribuidor);
    }

    @Override
    public Distrubuidor updateDistribuidor(Distrubuidor distribuidor) {
        return distribuidorDao.save(distribuidor);
    }

    @Override
    public void deleteDistribuidor(Long id) {
        distribuidorDao.deleteById(id);
    }


}
