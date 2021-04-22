package stage.sir.gestioncomptabilite.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stage.sir.gestioncomptabilite.bean.DeclarationIR;
import stage.sir.gestioncomptabilite.service.DeclarationIRService;

@RestController
@RequestMapping("gestion-comptabilite/declarationIr")
public class DeclarationIRProvided {
	@Autowired
	DeclarationIRService declarationIRService;
	
	@GetMapping("/ref/{ref}")
	public DeclarationIR findByRef(@PathVariable String ref) {
		return declarationIRService.findByRef(ref);
	}
	@GetMapping("annee/{annee}")
	public DeclarationIR findByAnnee(@PathVariable Integer annee) {
		return declarationIRService.findByAnnee(annee);
	}
	@DeleteMapping("mois/{mois}")
	public int deleteByMois(@PathVariable Integer mois) {
		return declarationIRService.deleteByMois(mois);
	}
	@PostMapping("/")
	public int save(@RequestBody DeclarationIR declarationIR) {
		return declarationIRService.save(declarationIR);
	}
	@GetMapping("/")
	public List<DeclarationIR> findAll() {
		return declarationIRService.findAll();
	}
	@GetMapping("id/{id}")
	public Optional<DeclarationIR> findById(@PathVariable Long id) {
		return declarationIRService.findById(id);
	}

}