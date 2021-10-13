package carnetcontacts.adresse;

import java.util.Objects;
import carnetcontacts.adresse.ETypeAdr;

public abstract class AbstractAdresse {
    protected Integer numRue;
    protected String nomRue;
    protected String nomVille;
    protected EtypeAdr typeAdr;

    AbstractAdresse(Integer numrue,
                     String nomrue,
                     String nomville,
                     EtypeAdr typad){
        numRue = Objects.requireNonNull(numrue, "Le numéro de rue ne peux pas être nul!");
        nomRue = Objects.requireNonNull(nomrue, "Le nom de rue ne peux pas être null!");
        nomVille = Objects.requireNonNull(nomville, "Le nom de la ville ne peut pas être nul!");
        typeAdr = typad;
    }

    public final Integer getNumRue(){
        return this.numRue;
    }

    public final String getNomRue(){
        return this.nomRue;
    }

    public final String getNomVille(){
        return this.nomVille;
    }

    public final EtypeAdr getTypeAdr(){
        return this.typeAdr;
    }
}

