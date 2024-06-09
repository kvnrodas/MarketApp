package com.gt.MarketApp.persistence.crud;

import com.gt.MarketApp.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByIdCantidadStockLessThanAndEstado(int cantidadStock);


}



