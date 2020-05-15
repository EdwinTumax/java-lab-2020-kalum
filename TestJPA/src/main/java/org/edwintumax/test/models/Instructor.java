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
// import org.apache.commons.lang3.StringUtils;


@Entity
@Table (name = "instructor")
@NamedQueries({@NamedQuery(name = "Instructor.findAll", query = "select i from Instructor i")})
public class Instructor implements Serializable{
   private StringProperty instructorId;
   private StringProperty apellidos;
   private StringProperty nombres;
   private StringProperty direccion;  
   private StringProperty telefono;  
   private StringProperty comentario;   
   private StringProperty estatus;  
   private StringProperty foto;
   private List<Clase> clases;
    
   public Instructor() {
       this.instructorId = new SimpleStringProperty();
       this.apellidos = new SimpleStringProperty();
       this.nombres = new SimpleStringProperty();
       this.direccion = new SimpleStringProperty();
       this.telefono = new SimpleStringProperty();
       this.comentario = new SimpleStringProperty();
       this.estatus = new SimpleStringProperty();
       this.foto = new SimpleStringProperty();
    }
     
    @Id
    @Column(name = "instructor_id")
    public String getInstructorId() {
        return instructorId.get();
    }

    public void setInstructorId(String instructorId) {
        this.instructorId.set(instructorId);
    }
    public StringProperty instructorId(){
        return this.instructorId;
    }
    
    @Column(name = "apellidos", nullable = false)
    public String getApellidos() {
        return apellidos.get();
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }
    
    public StringProperty apellidos(){
        return this.apellidos;
    }
    
    @Column(name = "nombres", nullable = false)
    public String getNombres() {
        return nombres.get();
    }

    public void setNombres(String nombres) {
        this.nombres.set(nombres);
    }
    
    public StringProperty nombres(){
        return this.nombres;
    }
    
    @Column(name = "direccion", nullable = false)
    public String getDireccion() {
        return direccion.get();
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }
    
    public StringProperty direccion(){
        return this.direccion;
    }
    
    @Column(name = "telefono", nullable = false)
    public String getTelefono() {
        return telefono.get();
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }
    
    public StringProperty telefono(){
        return this.telefono;
    }
    
    @Column(name = "comentario", nullable = false)
    public String getComentario() {
        return comentario.get();
    }

    public void setComentario(String comentario) {
        this.comentario.set(comentario);
    }

    public StringProperty comentario(){
        return this.comentario;
    }
    
    @Column(name = "estatus", nullable = false)
    public String getEstatus() {
        return estatus.get();
    }

    public void setEstatus(String estatus) {
        this.estatus.set(estatus);
    }
    
    public StringProperty estatus(){
        return this.estatus;
    }
    
    @Column(name = "foto", nullable = false)
    public String getFoto() {
        return foto.get();
    }

    public void setFoto(String foto) {
        this.foto.set(foto);
    }
   
    public StringProperty foto(){
        return this.foto;
    }

    @OneToMany(mappedBy="instructor",fetch=FetchType.EAGER)
    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }
   
    /*public String toString(){
        return StringUtils.rightPad(this.getApellidos(),32, " ")+ " | " + this.getNombres() + " | " + this.getTelefono();
    }*/
    
}
