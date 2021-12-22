package epv.inventario.inventarioback.controllers.res;

import epv.inventario.inventarioback.entity.Proveedor;
import epv.inventario.inventarioback.service.ProveedorService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin("http://localhost:4200/")
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;
    @GetMapping("/listar")
    public ResponseEntity<List<Proveedor>> listar(){

       return new ResponseEntity<>(proveedorService.listar(), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Proveedor> guardar(@RequestBody Proveedor proveedor){

        return  new ResponseEntity<>(proveedorService.guardar(proveedor),HttpStatus.OK);
    }


}
