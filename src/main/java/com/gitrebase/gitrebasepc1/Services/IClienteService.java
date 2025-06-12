package com.gitrebase.gitrebasepc1.Services;

import com.gitrebase.gitrebasepc1.Models.entities.Cliente;

import java.util.List;

public interface IClienteService {
    Cliente getClienteByid(Long id);
    List<Cliente> getAllClientes();
    Cliente createCliente(Cliente cliente);
    Cliente updateCliente(Long id,Cliente cliente);
    void deleteCliente(Long id);
}
