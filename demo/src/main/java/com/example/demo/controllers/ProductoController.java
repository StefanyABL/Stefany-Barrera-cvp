package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ProductoService;
import com.example.demo.models.*;;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;


    @GetMapping()
    public ArrayList<ProductoModel> listaProductos (){
        return productoService.productos();
    }
    //método también utilizado para actulizar, se diferencia de guardar por el envío del id del producto
    @PostMapping()
    public ProductoModel saveProducto (@RequestBody ProductoModel productoModel){
        return this.productoService.agregarProducto(productoModel);

    }
    @GetMapping( path = "/{id}")
    public Optional<ProductoModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.productoService.findId(id);
    }

   

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.productoService.eliminarProducto(id);
        if (ok){
            return "eliminado " ;
        }else{
            return "No se eliminó correctamente ";
        }
    }

    
}
