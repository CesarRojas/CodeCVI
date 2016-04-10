/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BS.Controllers;

import BS.Data.Acopio;
import BS.Repositories.AcopioFacade;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar Rojas
 */
public class beanAcopio {

    private Integer id;
    private String nombre;
    private String identificador;
    private double capacidad;
    private double stock;
    private int estado;
    @Inject
    private AcopioFacade acopioFacade;

    /**
     * Creates a new instance of BeanAcopio
     */
    public beanAcopio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public AcopioFacade getAcopioFacade() {
        return acopioFacade;
    }

    public void setAcopioFacade(AcopioFacade acopioFacade) {
        this.acopioFacade = acopioFacade;
    }

    public String Save() {
        Acopio auxiliar = new Acopio();
        auxiliar.setNombre(this.getNombre());
        auxiliar.setIdentificador(this.getIdentificador());
        auxiliar.setCapacidad(this.getCapacidad());
        auxiliar.setStock(this.getStock());
        auxiliar.setEstado(0);
        this.getAcopioFacade().create(auxiliar);
        this.setId(auxiliar.getId());
        return "index";
    }

    public String prepareList() {
        return "index";
    }

    public String prepareCreate() {
        return "index";
    }

    public String Delete(Integer id) {
        Acopio auxiliar = this.getAcopioFacade().find(id);
        this.getAcopioFacade().remove(auxiliar);
        return "index";
    }

    public String Edit(Integer id) {
        Acopio auxiliar = this.getAcopioFacade().find(id);
        this.setId(auxiliar.getId());
        this.setNombre(auxiliar.getNombre());
        this.setIdentificador(auxiliar.getIdentificador());
        this.setCapacidad(auxiliar.getCapacidad());
        this.setStock(auxiliar.getStock());
        this.setEstado(auxiliar.getEstado());
        return "index";
    }

    public String SaveEdition(beanAcopio b, Integer id) {
        Acopio auxiliar = new Acopio(id, b.getNombre(), b.getIdentificador(), b.getCapacidad(), b.getStock(), b.getEstado());
        this.getAcopioFacade().edit(auxiliar);
        return "index";
    }

    public List<Acopio> getAcopios() {
        return this.getAcopioFacade().findAll();
    }

}
