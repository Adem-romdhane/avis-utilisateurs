package tech.chillo.avis.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.chillo.avis.entite.Utilisateur;
import tech.chillo.avis.repository.UtilisateurRepository;

@AllArgsConstructor
@Service
public class UtilisateurService {

    private  UtilisateurRepository utilisateurRepository;

    public void inscription(Utilisateur utilisateur){
        this.utilisateurRepository.save(utilisateur);
    }
}
