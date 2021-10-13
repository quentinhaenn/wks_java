package carnetcontacts.adresse;

import java.util.Objects;


public class AdresseFr extends AbstractAdresse{
    private String codepostal;
    
     public AdresseFr(Integer numRue, String nomRue, String nomVille,
            String codep){
        super(numRue, nomRue, nomVille, ETypeAdr.EU);
        codepostal = Objects.requireNonNull(codep, "Le code postal ne peux pas etre nul!");
    }

    /**
     * @return the codepostal
     */
    public String getCodePostal() {
        return codepostal;
    }
    @Override
    public String toString(){
        return super.toString() + " " + codepostal;
    }
}
