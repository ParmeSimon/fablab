package fr.fablab.pret;

public class DureeInvalide extends ExceptionMetier {

    public DureeInvalide(int duree) {
        super("DUREE_INVALIDE", 400, "Durée de prêt invalide : " + duree + " jours (de 1 à " + Pret.DUREE_MAX_JOURS + ")");
    }
}
