package br.com.springzada.bebidas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springzada.bebidas.beans.Bebidas;
import br.com.springzada.bebidas.dao.BebidasDAO;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class BebidasController {
	@Autowired
	private BebidasDAO dao;

	@GetMapping("/bebidas")
	public ResponseEntity<List<Bebidas>> getAll() {

		List<Bebidas> lista = (List<Bebidas>) dao.findAll();

		if (lista.size() == 0) {

			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/bebidas/{id}")
	public Bebidas listaBebidaUnica(@PathVariable(value = "id") long id) {
		return dao.findById(id);
	}

	@PostMapping("/bebidas")
	public Bebidas salvaBebidas(@RequestBody Bebidas bebidas) {
		return dao.save(bebidas);
	}

	@DeleteMapping("/bebidas")
	public void deletaBebidas(@RequestBody Bebidas bebidas) {
		dao.delete(bebidas);
	}

	@PutMapping("/bebidas")
	public Bebidas atualizaBebidas(@RequestBody Bebidas bebidas) {
		return dao.save(bebidas);
	}
}
