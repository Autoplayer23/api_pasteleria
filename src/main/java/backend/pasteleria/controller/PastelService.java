package backend.pasteleria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.pasteleria.model.Pastel;

@Service
public class PastelService {
	@Autowired
	private PastelRepository pastelrepository;

	public void Guardar(Pastel pastel) {
		pastelrepository.save(pastel);
	}
	
	public List<Pastel> Obtener(){
		return pastelrepository.findAll();
	}

	
	public Optional<Pastel> ObtenerPastel(Integer id) {
		
		return pastelrepository.findById(id);
	}
	
	public Pastel actualizar (Pastel pastel) {
		return pastelrepository.save(pastel);
	}
	
	public void eliminar (Integer id) {
		
		pastelrepository.deleteById(id);
	}

	

}
