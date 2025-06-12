package com.gitrebase.gitrebasepc1.Services.impl;

import com.gitrebase.gitrebasepc1.Models.dao.IVentaDao;
import com.gitrebase.gitrebasepc1.Models.entities.Cliente;
import com.gitrebase.gitrebasepc1.Models.entities.Venta;
import com.gitrebase.gitrebasepc1.Services.IClienteService;
import com.gitrebase.gitrebasepc1.Services.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaServiceImpl implements IVentaService {
    private final IVentaDao ventaDao;
    private final IClienteService clienteService;

    @Autowired
    public VentaServiceImpl(IVentaDao ventaDao,IClienteService clienteService){
        this.ventaDao=ventaDao;
        this.clienteService=clienteService;
    }

    @Transactional(readOnly = true)
    @Override
    public Venta getVentaById(Long id) {
        return ventaDao.findById(id).orElseThrow(()->new RuntimeException(("Venta no encontrada")));
    }

    @Transactional(readOnly = true)
    @Override
    public List<Venta> getAllVentas() {
        List<Venta> ventas = new ArrayList<>();
        ventaDao.findAll().forEach(ventas::add);
        return ventas;
    }

    @Transactional
    @Override
    public Venta createVenta(Venta venta) {
        return ventaDao.save(venta);
    }

    @Transactional
    @Override
    public Venta updateVenta(Long id, Venta venta) {
        Venta oldVenta = this.getVentaById(id);
        venta.setMonto(venta.getMonto());
        venta.setFecha(venta.getFecha());
        Cliente cliente = clienteService.getClienteByid(venta.getCliente().getId());
        venta.setCliente(cliente);
        return ventaDao.save(oldVenta);
    }

    @Transactional
    @Override
    public void deleteVenta(Long id) {
        ventaDao.deleteById(id);
    }
}
