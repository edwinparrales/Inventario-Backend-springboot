package epv.inventario.inventarioback.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;
    private String nombre;
    private String dni;
    private String email;
    private String telefono;
    @Column(name = "tipo_proveedor")
    private String tipoProveedor;


}
