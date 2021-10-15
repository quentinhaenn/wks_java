package carnetcontacts.contact;

public class Entreprise extends AbstractContact {
    private Integer mSiret;
    private ECategory mCat;

    public Entreprise(String nom, 
                    Coordonnees coord,
                    Integer siret,
                    ECategory category){
        super(nom,coord);
        mSiret = siret;
        mCat = category;
    }

    public Integer getSiret(){
        return this.mSiret;
    }

    public ECategory getCategory(){
        return this.mCat;
    }
}