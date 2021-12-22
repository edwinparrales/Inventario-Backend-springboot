package epv.inventario.inventarioback.controllers.res;

import epv.inventario.inventarioback.entity.Categoria;
import epv.inventario.inventarioback.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("http://localhost:4200/")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Categoria>> listar() {

        return new ResponseEntity<>(categoriaService.listar(), HttpStatus.OK);
    }

    @PostMapping("/guardar")

    public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(categoriaService.guardar(categoria), HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        categoriaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/actualizar")
    public ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria) {

        return new ResponseEntity<>(categoriaService.actualizar(categoria), HttpStatus.ACCEPTED);
    }
    //metodo para realizar busquedas por la descripcion

    @GetMapping("/buscarDescripcion/{descripcion}")
    public ResponseEntity<List<Categoria>> buscarDescripcion(@PathVariable(name = "descripcion")
                                                             String descripcion){

        return  new ResponseEntity<>(categoriaService.buscarDescripcion(descripcion),HttpStatus.OK);

    }
}
