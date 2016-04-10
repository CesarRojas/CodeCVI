/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BS.Data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cesar Rojas
 */
@Entity
@Table(name = "acopio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acopio.findAll", query = "SELECT a FROM Acopio a"),
    @NamedQuery(name = "Acopio.findById", query = "SELECT a FROM Acopio a WHERE a.id = :id"),
    @NamedQuery(name = "Acopio.findByNombre", query = "SELECT a FROM Acopio a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Acopio.findByIdentificador", query = "SELECT a FROM Acopio a WHERE a.identificador = :identificador"),
    @NamedQuery(name = "Acopio.findByCapacidad", query = "SELECT a FROM Acopio a WHERE a.capacidad = :capacidad"),
    @NamedQuery(name = "Acopio.findByStock", query = "SELECT a FROM Acopio a WHERE a.stock = :stock"),
    @NamedQuery(name = "Acopio.findByEstado", query = "SELECT a FROM Acopio a WHERE a.estado = :estado")})
public class Acopio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "identificador")
    private String identificador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private double capacidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private double stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Acopio() {
    }

    public Acopio(Integer id) {
        this.id = id;
    }

    public Acopio(Integer id, String nombre, String identificador, double capacidad, double stock, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.identificador = identificador;
        this.capacidad = capacidad;
        this.stock = stock;
        this.estado = estado;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acopio)) {
            return false;
        }
        Acopio other = (Acopio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BS.Data.Acopio[ id=" + id + " ]";
    }
    
}
