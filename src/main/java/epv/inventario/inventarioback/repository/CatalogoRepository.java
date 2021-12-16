package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CatalogoRepository extends PagingAndSortingRepository<CatalogoProducto,Long> {
}
