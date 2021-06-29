package oraclejpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablaController {

	@Autowired
	private TablaRepository tablaRepo;

	@GetMapping("/tablas")
    public List<Tabla> listAll(Model model) {
        return tablaRepo.findAll();
    }
	
}
