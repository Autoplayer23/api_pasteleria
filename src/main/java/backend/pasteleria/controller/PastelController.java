package backend.pasteleria.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.pasteleria.model.Pastel;

@RestController
@CrossOrigin(origins="*")
public class PastelController {
	@Autowired
	private PastelService pastelservice;
	
	
	@PostMapping("api/pastel")
	public Pastel  guardar (@RequestBody Pastel pastel ) {
		System.out.println(pastel);
		pastelservice.Guardar(pastel);
		return pastel;
	}
	
	@GetMapping("api/pastel")
	public List<Pastel> Obtener(){
		return pastelservice.Obtener();
	}
	
	@GetMapping("api/pastel/{id}")
	public Optional<Pastel> ObtenerPastel(@PathVariable("id") Integer id) {
		return pastelservice.ObtenerPastel(id);
	}
	@PutMapping("api/pastel")
	public Pastel actualizar(@RequestBody Pastel pastel) {
		
		return pastelservice.actualizar(pastel);
	}
	
	@DeleteMapping("api/pastel/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		pastelservice.eliminar(id);
	}

}
