package carnetcontacts.adresse;

import java.util.Objects;


public class AdresseUs extends AbstractAdresse {
    private String zipCode;
    private String stateCode;
    private String stateName;

    public AdresseUs(Integer numRue, String nomRue,String nomVille,
                    String zipcode,
                    String statecode,
                    String statename){
        super(numRue, nomRue, nomVille, ETypeAdr.US);
        zipCode = Objects.requireNonNull(zipcode, "Le code zip ne peut pas etre nul !");
        stateCode = Objects.requireNonNull(statecode, "Le state code ne peut pas etre nul !");
        stateName = Objects.requireNonNull(statename, "Le nom de l'etat ne peut pas etre nul!");
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @return the stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * @return the stateName
     */
    public String getStateName() {
        return stateName;
    }

}