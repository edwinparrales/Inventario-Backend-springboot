package epv.inventario.inventarioback.repository;

import epv.inventario.inventarioback.entity.Marca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Long> {



}
