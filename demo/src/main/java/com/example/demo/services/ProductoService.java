package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ProductoModel;
import com.example.demo.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> productos (){
        return (ArrayList<ProductoModel>) productoRepository.findAll();

    }

    public ProductoModel agregarProducto(ProductoModel productoModel){
        return productoRepository.save(productoModel);    }

    public Optional<ProductoModel> findId(Long id){
            return productoRepository.findById(id);

    }
    public boolean eliminarProducto(Long id) {
        try{
            productoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}
