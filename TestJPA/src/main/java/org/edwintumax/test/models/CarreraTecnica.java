package org.edwintumax.test.models;
import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "carrera_tecnica")
@NamedQueries({@NamedQuery(name="CarreraTecnica.findAll", query="select ct from CarreraTecnica ct")})
public class CarreraTecnica implements Serializable{
    private final StringProperty codigoCarrera;
    private final StringProperty nombre;
    private List<Clase> clases;
        
    public CarreraTecnica() {
        this.codigoCarrera = new SimpleStringProperty();
        this.nombre = new SimpleStringProperty();
    }

    @OneToMany(mappedBy = "carreraTecnica", fetch = FetchType.EAGER)
    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }
    
    /*public CarreraTecnica(String codigoCarrera, String nombre) {
        this.codigoCarrera = new SimpleStringProperty();
        this.nombre = new SimpleStringProperty();
    }*/
    @Id
    @Column(name = "codigo_carrera")
    public String getCodigoCarrera() {
        return codigoCarrera.get();
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera.set(codigoCarrera);
    }
    
    public StringProperty codigoCarrera(){
        return this.codigoCarrera;
    }

    @Column(name = "nombre", nullable = false)
    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    public StringProperty nombre(){
        return this.nombre;
    }
    
    public String toString(){
        return this.getNombre();
    }
   
}