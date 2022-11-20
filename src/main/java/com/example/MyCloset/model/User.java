package com.example.MyCloset.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Usar si existe auto_increment. describe una columna con incremento automático con cada operacion de inserción. Requiere una clave principal para cada entidad administrada, es decir (@id), si no; omitir
    @Column(name = "id")
    private int id; //No es necesario incluir la priary key en el constructor, ya que se genera automáticamente

    @Column(name = "nombre")
    private String nombre;

    public User(String nombre, Pais pais, Estado estado) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
    }

	//con las cascadas se especifica que no se debe eliminar nada
    //@OneToMany(mappedBy = "usuario", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}) //hace referencia a la variable con la que se hace refercia a esta tabla en la clase que representa la parte "many"
    @ManyToOne //En este caso significa que un pais puede tener asociadas varias personas, y que una persona tiene asociado un país
    @JoinColumn( name = "idpais") // nombre de la columna de la tabla persona (esta clase) que será la foreign key (OJO el nombre de la columna en la BD, no la varaible de la clase)
    private Pais pais;
    @ManyToOne
    @JoinColumn(name = "idestado") // columna que la tabla persona que se corresponde con la columna que es primary key en la tabla estado
    private Estado estado;
    //relación con el campo de la otra tabla 
}
