package com.gt.MarketApp.persistence;

import com.gt.MarketApp.domain.Product;
import com.gt.MarketApp.domain.repository.ProductRepository;
import com.gt.MarketApp.persistence.crud.IProductoCrudRepository;
import com.gt.MarketApp.persistence.entity.Producto;
import com.gt.MarketApp.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private IProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> getAll(){

        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return productMapper.toProducts(productos);

    }

    @Override
    public  Optional<List<Product>> getByCategory(int categoryId){
        List<Producto> productos =  productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.ofNullable(productMapper.toProducts(productos));

    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {

        Optional<List<Producto>> productos =  productoCrudRepository.findByIdCantidadStockLessThanAndEstado(quantity);
        return productos.map(prods -> productMapper.toProducts(prods));

    }

    @Override
    public Optional<Product> getProduct(int productId) {

        return productoCrudRepository.findById(productId).map(producto -> productMapper.toProduct(producto));

    }

    @Override
    public Product save(Product product) {
        Producto producto = productMapper.toProducto(product);
        return productMapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId){
        productoCrudRepository.deleteById(productId);
    }

}
