package fr.fablab.pret;

public class MaterielIndisponible extends ExceptionMetier {

    public MaterielIndisponible(String code) {
        super("MATERIEL_INDISPONIBLE", 409, "Matériel déjà prêté : " + code);
    }
}
