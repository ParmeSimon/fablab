package fr.fablab.pret;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PretRepository extends JpaRepository<Pret, Long> {

    long countByAdherentAndDateRetourIsNull(String adherent);

    boolean existsByMaterielAndDateRetourIsNull(String materiel);
}
