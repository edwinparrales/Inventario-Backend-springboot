package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.Proveedor;
import epv.inventario.inventarioback.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProveedorService implements GenericoService<Proveedor,Long>{
    @Autowired
    ProveedorRepository proveedorRepository;
    @Override
    public List<Proveedor> listar(){
        return proveedorRepository.findAll();
    }

    @Override
    public <S extends Proveedor> S guardar(S entity) {
         return proveedorRepository.save(entity);
    }

    @Override
    public void eliminar(Proveedor entity) {
         proveedorRepository.delete(entity);
    }

    @Override
    public void eliminarPorId(Long id) {
     proveedorRepository.deleteById(id);
    }

    @Override
    public Proveedor buscarPorId(Long id) {
        return  proveedorRepository.findById(id).get();
    }
}
