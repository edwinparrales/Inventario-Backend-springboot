package epv.inventario.inventarioback.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "categorias")
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    private String codigo;
    @Getter
    @Setter
    private String descripcion;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}