package epv.inventario.inventarioback.entity;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "catalogo_productos")
@Entity
public class CatalogoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "codigo_ean")
    private String codigoEan;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria idCategoria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_marca", nullable = false)
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

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "id_usuario", length = 100)
    private String idUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}