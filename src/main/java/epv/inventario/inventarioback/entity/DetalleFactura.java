package epv.inventario.inventarioback.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="detalle_factura")
@Data
public class DetalleFactura implements Serializable
{
    @EmbeddedId
    private  DetalleFacturaPK Id;
    private Integer cantidad;
    private Double total;
    @ManyToOne
    @MapsId("idFactura")
    @JoinColumn(name = "id_factura",insertable = false,updatable = false)
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "id",insertable = false,updatable = false)
    private CatalogoProducto catalogoProducto;
}
