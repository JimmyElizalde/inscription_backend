package uic.inscripcion.feature.inscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/inscription")
@CrossOrigin({ "*" })
public class InscriptionController {
    @Autowired
    InscriptionService inscriptionService;

    // Get
    @GetMapping("/{id}")
    public Inscription findById(@PathVariable Long id) {
        return inscriptionService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Inscription> findAll() {
        return inscriptionService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Inscription> findByName(@PathVariable String term) {
        return inscriptionService.findByName(term);
    }

    // Post

    @PostMapping("/save")
    public Inscription saveInscription(@RequestBody Inscription inscription) {
        return inscriptionService.save(inscription);
    }

    // Update

    @PutMapping("/update")
    public Inscription updatPerson(@RequestBody Inscription inscription) {
        return inscriptionService.save(inscription);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInscription(@PathVariable Long id) {
        inscriptionService.deleteById(id);
    }

}
