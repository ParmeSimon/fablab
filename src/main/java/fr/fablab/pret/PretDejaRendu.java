package fr.fablab.pret;

public class PretDejaRendu extends ExceptionMetier {

    public PretDejaRendu(Long id) {
        super("PRET_DEJA_RENDU", 409, "Prêt déjà rendu : " + id);
    }
}
