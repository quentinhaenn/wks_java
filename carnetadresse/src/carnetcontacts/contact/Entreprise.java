package carnetcontacts.contact;

import java.util.Objects;

public class Entreprise extends AbstractContact {
    private Integer mSiret;
    private ECategory mCat;

    public Entreprise(String nom, 
                    Coordonnees coord,
                    Integer siret,
                    ECategory category){
        super(nom,coord);
        mSiret = Objects.requireNonNull(siret, "Le SIRET ne peut pas être nul");
        mCat = Objects.requireNonNull(category, "La categorie ne peut etre nulle");
    }

    public Integer getSiret(){
        return mSiret;
    }

    public Category getCategory(){
        return mCat;
    }
}