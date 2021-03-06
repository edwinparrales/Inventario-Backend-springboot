package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

    public List<Categoria>  findCategoriaByDescripcionContaining(String descripcion);
}
