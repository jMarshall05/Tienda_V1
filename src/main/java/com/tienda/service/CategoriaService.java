
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
   
    public List<Categoria> getCategorias(boolean activos);
    
    //obtiene un categoria a partir del id de una categoria
    public Categoria getCategoria (Categoria categoria);
    
    //se inserta una nueva categoria si el id del cateogria esta vacia
    
    //se actualiza la el categoria si el id NO esta vacia
    public void save(Categoria categoria);
    //se elimina el categoria que corresponde al id
    public void delete(Categoria Categoria);
}
