package epv.inventario.inventarioback.controllers.app;

import epv.inventario.inventarioback.entity.Marca;
import epv.inventario.inventarioback.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("app")
public class HomeController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/saludo")
    public  String saludo(Model model){
        List<Marca> marcas = marcaService.listar();
        model.addAttribute("msg", "Welcome to the Netherlands!");
        model.addAttribute("marcas",marcas);

        return "saludo";
    }
}
