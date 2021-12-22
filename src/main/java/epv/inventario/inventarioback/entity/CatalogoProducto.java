package epv.inventario.inventarioback.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Table(name = "catalogo_productos")
@Entity
public class CatalogoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Long idProducto;

    @Column(name = "codigo_ean")
    private String codigoEan;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Setter
    @Getter
    @Column(name = "id_categoria")
    private Long idCategoria;
    @Getter
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria", nullable = false,insertable = false, updatable = false)
    private Categoria categoria;

    @Setter
    @Getter
    @Column(name = "id_marca")
    private Long idMarca;
    @Getter
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_marca", nullable = false,insertable = false, updatable = false)
    private Marca marca;

    @Column(name = "modelo", length = 80)
    private String modelo;

    @Column(name = "codigo_ref", nullable = false, length = 50)
    private String codigoRef;

    @Column(name = "cantidad", nullable = false)
    private Long cantidad;

    @Column(name = "cantidad_min", nullable = false)
    private Integer cantidadMin;

    @Column(name = "valor_producto", nullable = false)
    private Double valorProducto;

    @Column(name = "imagen", length = 250)
    private String imagen;
    @Getter
    @Setter
    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "id_usuario", length = 100)
    private String idUsuario;

    @Setter
    @Getter
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Getter
    @ManyToOne
    @JoinColumn(name = "id_proveedor", insertable = false, updatable = false)
    Proveedor proveedor;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }



    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(Double valorProducto) {
        this.valorProducto = valorProducto;
    }

    public Integer getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(Integer cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoRef() {
        return codigoRef;
    }

    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long id) {
        this.idProducto = id;
    }
}