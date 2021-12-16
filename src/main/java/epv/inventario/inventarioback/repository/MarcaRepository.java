package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MarcaRepository extends PagingAndSortingRepository<Marca,Long> {



}
