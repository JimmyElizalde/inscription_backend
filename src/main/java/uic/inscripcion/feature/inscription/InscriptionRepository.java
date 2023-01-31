package uic.inscripcion.feature.inscription;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
    
    List<Inscription> findAll();
    List<Inscription> findByNameLikeIgnoreCase(String term);

}
