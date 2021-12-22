package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {
}
