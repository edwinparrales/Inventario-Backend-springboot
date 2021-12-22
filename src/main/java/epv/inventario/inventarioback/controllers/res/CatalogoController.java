package epv.inventario.inventarioback.controllers.res;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import epv.inventario.inventarioback.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    CatalogService catalogService;
    @GetMapping("/listar")
    public ResponseEntity<List<CatalogoProducto>> listar(){

        return  new ResponseEntity<>(catalogService.listar(), HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200/")
    @PostMapping("/guardar")
    public  ResponseEntity<CatalogoProducto> guardar(@RequestBody CatalogoProducto catalogoProducto){
        System.out.println(catalogoProducto.getCantidad());
        return  new ResponseEntity<>(catalogService.guardar(catalogoProducto),HttpStatus.CREATED);
    }

    //Metodo para buscar por codigo ean o codigo referencia
    @CrossOrigin(origins = "*")
    @GetMapping("buscarCodigo/{codigo}")
    public ResponseEntity<List<CatalogoProducto>> buscarCodigoOrEan(@PathVariable(name = "codigo")
                                                                    String codigo){


      return  new ResponseEntity<>(catalogService.buscarCodigoOrEan(codigo),HttpStatus.OK);

    }


}
