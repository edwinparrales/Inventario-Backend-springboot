package epv.inventario.inventarioback.controllers.res;

import epv.inventario.inventarioback.entity.Marca;
import epv.inventario.inventarioback.service.MarcaService;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @Autowired
    MarcaService marcaService;
    @GetMapping("/listar/{pageNo}/{pageSize}")
    public ResponseEntity<Page<Marca>> listar(@PathVariable( name = "pageNo")  int pageNo,
                                              @PathVariable(name = "pageSize") int pageSize){

       // pageNo = pageNo==0 ?0:pageNo;
        //pageSize = pageSize==0?5:pageSize;


      Page<Marca> paginas = marcaService.listarPaginado(pageNo,pageSize);


        return new ResponseEntity(paginas, new HttpHeaders(), HttpStatus.OK);


    }

    //listado total @RequestParam(value="name", defaultValue="World"But for a @RequestParam request,
    // sthe parameter is URL decoded:
    //
    //http://localhost:8080/foos?id=ab+c
    @CrossOrigin("*")
    @GetMapping("/listar")
    public ResponseEntity<List<Marca>> listaTotal(){


        List<Marca> list = marcaService.listar();

        return new ResponseEntity<List<Marca>>(list, new HttpHeaders(), HttpStatus.OK);


    }
    @PostMapping("/guardar")

    public ResponseEntity<Marca> guardar( @RequestBody Marca marca){

        Marca mra = marcaService.guardar(marca);
        return  new ResponseEntity<>(mra,HttpStatus.CREATED);
    }

    @GetMapping("/listarOrd/{pageNo}/{pageSize}/{column}")
    public ResponseEntity<Page<Marca>> listaOrdenada(@PathVariable( name = "pageNo")  int pageNo,
                                              @PathVariable(name = "pageSize") int pageSize,
                                                     @PathVariable(name = "column") String columna){

        Page<Marca> pagMarca = marcaService.listarOrden(pageNo,pageSize,columna);

        return new ResponseEntity<>(pagMarca,HttpStatus.OK);



    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity eliminar(@PathVariable Long id){
        marcaService.eliminar(id);
        return  new ResponseEntity<>(HttpStatus.OK);

    }



}
