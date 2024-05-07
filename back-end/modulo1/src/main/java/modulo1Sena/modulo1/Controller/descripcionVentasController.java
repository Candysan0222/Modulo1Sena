package modulo1Sena.modulo1.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modulo1Sena.modulo1.Controller.ObjetoT.objetoTController;
import modulo1Sena.modulo1.Repository.descripcionVentas;

@RequestMapping ("/api/v1/modulo1/descripcionVentas")
@RestController
@CrossOrigin
public class descripcionVentasController extends objetoTController<descripcionVentas>{

}
