package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import epv.inventario.inventarioback.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.List;

@Service
@Transactional
public class CatalogService {
    @Autowired
    private CatalogoRepository catalogoRepository;

    public CatalogoProducto guardar(CatalogoProducto catalogoProducto) {
        catalogoProducto.setIdMarca( Long.parseLong(catalogoProducto.getIdMarca()+""));
        catalogoProducto.setIdProveedor( Long.parseLong(catalogoProducto.getIdProveedor()+""));
        catalogoProducto.setFechaCreacion(Instant.now());

        return catalogoRepository.save(catalogoProducto);
    }

    public List<CatalogoProducto> listar() {

        return (List<CatalogoProducto>) catalogoRepository.findAll();
    }

    public void eliminar(Long id) {
        catalogoRepository.deleteById(id);
    }

    public List<CatalogoProducto> buscarCodigoOrEan(String codio){

        return  catalogoRepository.findCatalogoProductoByCodigoEanOrCodigoRef(codio,codio);
    }


}
