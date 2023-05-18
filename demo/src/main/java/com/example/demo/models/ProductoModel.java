package com.example.demo.models;


import javax.persistence.*;
@Entity
@Table(name = "Producto")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;
    private String descripcion;
    private long precio;
    private long cantidadini;
   
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public long getPrecio() {
        return precio;
    }
    public void setPrecio(long precio) {
        this.precio = precio;
    }
    public long getCantidadini() {
        return cantidadini;
    }
    public void setCantidadini(long cantidadini) {
        this.cantidadini = cantidadini;
    }


}
