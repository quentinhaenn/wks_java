package carnetcontacts.adresse;

import java.util.Objects;

public class AdresseUs extends AbstractAdresse{
    private String zipCode;
    private String stateCode;
    private String stateName;

    public AdresseUs(Integer numRue, String nomRue,String nomVille,
                    ETypeAdr typeAdr,
                    String zipcode,
                    String statecode,
                    String statename){
        super(numRue, nomRue, nomVille, typeAdr);
        zipCode = Objects.requireNonNull(zipcode, "Le code zip ne peut pas être nul !");
        stateCode = Objects.requireNonNull(statecode, "Le state code ne peut pas être nul !");
        stateName = Objects.requireNonNull(statename, "Le nom de l'état ne peut pas être nul!");
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