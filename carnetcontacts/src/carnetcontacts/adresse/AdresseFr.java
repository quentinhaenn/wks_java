package carnetcontacts.adresse;

import java.util.Objects;
import carnetcontacts.adresse.AbstractAdresse;
import carnetcontacts.adresse.ETypeAdr;

public class AdresseFr extends AbstractAdresse{
    private String codepostal;
    
    AdresseFr(Integer numRue, String nomRue, String nomVille,
            String codep, ETypeAdr typad){
        super(numRue, nomRue, nomVille, typad);
        codepostal = Objects.requireNonNull(codep, "Le code postal ne peux pas être nul!");
    }

    /**
     * @return the codepostal
     */
    public String getCodePostal() {
        return codepostal;
    }
}
