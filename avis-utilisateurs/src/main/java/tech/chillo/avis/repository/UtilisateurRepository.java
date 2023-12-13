package tech.chillo.avis.repository;

import org.springframework.data.repository.CrudRepository;
import tech.chillo.avis.entite.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
}
