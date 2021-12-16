package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.Categoria;
import epv.inventario.inventarioback.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
}
