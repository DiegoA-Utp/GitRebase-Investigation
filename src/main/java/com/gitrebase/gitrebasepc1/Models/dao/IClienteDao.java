package com.gitrebase.gitrebasepc1.Models.dao;

import com.gitrebase.gitrebasepc1.Models.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
}
