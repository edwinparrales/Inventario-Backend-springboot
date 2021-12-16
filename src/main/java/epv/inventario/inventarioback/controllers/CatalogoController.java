package epv.inventario.inventarioback.controllers;

import epv.inventario.inventarioback.entity.CatalogoProducto;
import epv.inventario.inventarioback.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    CatalogService catalogService;
    @GetMapping("listar")
    public ResponseEntity<List<CatalogoProducto>> listar(){

        return  new ResponseEntity<>(catalogService.listar(), HttpStatus.OK);
    }

}
