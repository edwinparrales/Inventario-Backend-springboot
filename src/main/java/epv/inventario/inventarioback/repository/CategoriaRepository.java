package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.Categoria;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoriaRepository extends PagingAndSortingRepository<Categoria,Long> {
}
