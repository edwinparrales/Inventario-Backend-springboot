package epv.inventario.inventarioback.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable {
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre;
    private String dni;
    private String email;
    private String telefono;
    @Column(name = "tipo_cliente")
    private String tipoCliente;
}
