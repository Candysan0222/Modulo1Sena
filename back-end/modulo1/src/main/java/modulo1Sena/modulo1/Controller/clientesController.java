package modulo1Sena.modulo1.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modulo1Sena.modulo1.Controller.ObjetoT.objetoTController;
import modulo1Sena.modulo1.Repository.clientes;

@RequestMapping ("/api/v1/modulo1/clientes")
@RestController
@CrossOrigin
public class clientesController extends objetoTController<clientes>{

}
