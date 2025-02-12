package com.multifun_api.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;
    @Column(name = "nombre")
    private String name;
    @Column(name = "id_categoria")
    private Integer idCategory;
    @Column(name = "codigo_barras")
    private String barcode;
    @Column(name = "precio_venta")
    private Double price;
    @Column(name = "cantidad_stock")
    private Integer stockQuantity;
    @Column(name = "estado")
    private Boolean status;


    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
