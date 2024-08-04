package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface ProductoService {

    public List<Producto> getProductos(boolean activos);

    //obtiene un producto a partir del id de una producto
    public Producto getProducto(Producto producto);

    //se inserta una nueva producto si el id del cateogria esta vacia
    //se actualiza la el producto si el id NO esta vacia
    public void save(Producto producto);

    //se elimina el producto que corresponde al id
    public void delete(Producto Producto);

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

}
