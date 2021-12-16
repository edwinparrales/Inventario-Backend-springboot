package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.Marca;
import epv.inventario.inventarioback.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class MarcaService
{
    @Autowired
    MarcaRepository marcaRepository;

    public Page<Marca> listar(int pagNo, int pagSize){
        Pageable paginar = PageRequest.of(pagNo,pagSize);
        //List<Marca> lista  = new ArrayList<>();
        Page<Marca> paginas = marcaRepository.findAll(paginar);



        return  paginas;
    }

    public List<Marca> listarGenerico(){

        return (List<Marca>) marcaRepository.findAll();
    }

    public Marca  guardar(Marca marca){
        return marcaRepository.save(marca);
    }

    public Page<Marca> listarOrden(int pagNo, int pagSize,String sorting){
        Sort sort = Sort.by(sorting);

        Pageable paginar = PageRequest.of(pagNo,pagSize,sort);

       return marcaRepository.findAll(paginar);

    }

}
