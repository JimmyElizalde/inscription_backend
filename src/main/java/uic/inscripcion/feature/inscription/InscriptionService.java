package uic.inscripcion.feature.inscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    @Autowired
    InscriptionRepository inscriptionRepository;

    public List<Inscription> findAll() {
        return inscriptionRepository.findAll();
    }

    public Inscription findById(long id) {
        return inscriptionRepository.findById(id).orElse(new Inscription());
    }

    public List<Inscription> findByName(String term) {
        return inscriptionRepository.findByNameLikeIgnoreCase(term + "%");
    }

    public Inscription save(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    public Inscription update(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    public void deleteById(long id) {
        inscriptionRepository.deleteById(id);
    }

}
