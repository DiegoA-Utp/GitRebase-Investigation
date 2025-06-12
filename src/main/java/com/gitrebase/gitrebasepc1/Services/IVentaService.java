package com.gitrebase.gitrebasepc1.Services;

import com.gitrebase.gitrebasepc1.Models.entities.Venta;

import java.util.List;

public interface IVentaService {
    Venta getVentaById(Long id);

    List<Venta> getAllVentas();

    Venta createVenta(Venta venta);

    Venta updateVenta(Long id, Venta venta);

    void deleteVenta(Long id);
}
