import java.util.ArrayList;
import java.util.List;

// Enum pour le statut de l'appartement
enum Statut {
    LIBRE, OCCUPE, EN_COURS_DE_LIBERATION
}

// Classe Appartement
class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;
    private Endroit endroit;

    public Appartement(String id, String titre, String description, double loyerMensuel, Statut statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    public String getId() {
        return id;
    }

    public Endroit getEndroit() {
        return endroit;
    }
}

// Classe Endroit (classe abstraite)
abstract class Endroit {
    private String id;
    private String nom;

    public Endroit(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public abstract int compterAppartements();
}

// Classe Immeuble
class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(String id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }

    public boolean contientAppartement(Appartement appartement) {
        return appartements.contains(appartement);
    }
}

// Classe Quartier
class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }

    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.contientAppartement(appartement)) {
                return true;
            }
        }
        return false;
    }
}
