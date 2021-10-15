package carnetcontacts.adresse;

import java.util.Objects;

public class AdresseFr extends AbstractAdresse{
    private static final int MULT_HASH_CODE = 13;
    private String codepostal;
    
    public AdresseFr(Integer numRue, String nomRue, String nomVille,
            String codep){
        super(numRue, nomRue, nomVille, ETypeAdr.EU);
        codepostal = Objects.requireNonNull(codep, "Le code postal ne peux pas être nul!");
    }


    /**
     * @return the codepostal
     */
    public String getCodePostal() {
        return codepostal;
    }

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }
        if (!(obj instanceof AdresseFr)) {
            return false;
        }

        AdresseFr adresseFr = (AdresseFr) obj;
        if (adresseFr.codepostal.equals(codepostal)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * MULT_HASH_CODE + super.hashCode();
        hash = hash * MULT_HASH_CODE + codepostal.hashCode();
        return hash;
    }
}
