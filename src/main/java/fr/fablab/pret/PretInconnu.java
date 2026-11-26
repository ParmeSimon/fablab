package fr.fablab.pret;

public class PretInconnu extends ExceptionMetier {

    public PretInconnu(long id) {
        super("PRET_INCONNU", 404, "Prêt inconnu : " + id);
    }
}
