package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import epv.inventario.inventarioback.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CatalogService {
    @Autowired
    private CatalogoRepository catalogoRepository;

    public CatalogoProducto guardar(CatalogoProducto catalogoProducto){
        return  catalogoRepository.save(catalogoProducto);
    }

    public List<CatalogoProducto> listar(){

         return (List<CatalogoProducto>) catalogoRepository.findAll();
    }



}
