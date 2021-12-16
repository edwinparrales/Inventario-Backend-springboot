package epv.inventario.inventarioback.entity;

import com.sun.istack.NotNull;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "marca")
@Generated
public class Marca {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Getter
     @Setter
     long id;
     @NotNull
     @Getter @Setter
     private String nombre;
     @NotNull()
     @Getter @Setter private int estado;




}
