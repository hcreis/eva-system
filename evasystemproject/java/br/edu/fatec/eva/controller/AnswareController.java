package br.edu.fatec.eva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.fatec.eva.model.Answare;
import br.edu.fatec.eva.service.AnswareService;

@Controller
public class AnswareController {
	@Autowired
	private AnswareService answareService;

	@RequestMapping(value = "/answare/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Answare>> list() {
		List<Answare> list = answareService.findAll();
		if (list.isEmpty()) {
			System.out.println("Nenhum registro no banco de dados.");
			return new ResponseEntity<List<Answare>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Answare>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/answare/question/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Answare> getByQuestion(@PathVariable Integer id) {
		Answare answare = answareService.findByQuestion(id);
		if (answare==null) {
			System.out.println("Nenhum registro no banco de dados.");
			return new ResponseEntity<Answare>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Answare>(answare, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/answare/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Answare> getById(@PathVariable Integer id) {
		Answare answare = answareService.findById(id);

		if (answare == null) {
			System.out.println("Não foi possível encontrar o " + id + " da bandeira cartao");
			return new ResponseEntity<Answare>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Answare>(answare, HttpStatus.OK);
	}
}