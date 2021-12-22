package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.Categoria;
import epv.inventario.inventarioback.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria guardar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listar(){
        return (List<Categoria>) categoriaRepository.findAll();
    }

    public void eliminar(Long id){
        categoriaRepository.deleteById(id);
    }

    public Categoria actualizar(Categoria categoria){
       return  categoriaRepository.save(categoria);
    }

    public List<Categoria> buscarDescripcion(String descripcion){
        return  categoriaRepository.findCategoriaByDescripcionContaining(descripcion);
    }

}
