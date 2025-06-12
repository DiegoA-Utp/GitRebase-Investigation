package com.gitrebase.gitrebasepc1.Services.impl;

import com.gitrebase.gitrebasepc1.Models.dao.IClienteDao;
import com.gitrebase.gitrebasepc1.Models.entities.Cliente;
import com.gitrebase.gitrebasepc1.Services.IClienteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    private final IClienteDao clienteDao;

    public ClienteServiceImpl(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente getClienteByid(Long id) {
        return clienteDao.findById(id).orElseThrow(()->new RuntimeException("Cliente no encontrado"));
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clienteDao.findAll().forEach(clientes::add);
        return clientes;
    }

    @Transactional
    @Override
    public Cliente createCliente(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional
    @Override
    public Cliente updateCliente(Long id, Cliente cliente) {
        Cliente oldCliente = getClienteByid(id);
        oldCliente.setNombres(cliente.getNombres());
        oldCliente.setApellidos(cliente.getApellidos());
        oldCliente.setEmail(cliente.getEmail());
        oldCliente.setTelefono(cliente.getTelefono());
        oldCliente.setDireccion(cliente.getDireccion());
        oldCliente.setFechaNacimiento(cliente.getFechaNacimiento());
        return clienteDao.save(oldCliente);
    }

    @Transactional
    @Override
    public void deleteCliente(Long id) {
        clienteDao.deleteById(id);
    }
}
