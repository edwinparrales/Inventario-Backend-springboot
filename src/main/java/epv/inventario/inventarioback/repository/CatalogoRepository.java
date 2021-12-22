package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogoRepository extends JpaRepository<CatalogoProducto,Long> {
    public List<CatalogoProducto> findCatalogoProductoByCodigoEanOrCodigoRef(String codigo1,String codigo2);
}
