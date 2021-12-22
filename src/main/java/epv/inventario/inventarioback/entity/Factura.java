package epv.inventario.inventarioback.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "facturas")
@Data
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;
    private String consecutivo;
    private double total;
    @Column(name = "total_descuento")
    private double totalDesc;


    @Column(name = "id_cliente")
    private Long idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;
    @Getter
    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "factura",cascade = {CascadeType.ALL})
    private List<DetalleFactura> detalleFactura;


}
