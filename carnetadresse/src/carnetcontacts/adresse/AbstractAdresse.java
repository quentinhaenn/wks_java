package carnetcontacts.adresse;

import java.util.Objects;
import carnetcontacts.adresse.ETypeAdr;

public abstract class AbstractAdresse {
    protected Integer numRue;
    protected String nomRue;
    protected String nomVille;
    protected ETypeAdr typeAdr;

    public AbstractAdresse(Integer numrue,
                     String nomrue,
                     String nomville,
                     ETypeAdr typad){
        numRue = Objects.requireNonNull(numrue, "Le numero de rue ne peux pas etre nul!");
        nomRue = Objects.requireNonNull(nomrue, "Le nom de rue ne peux pas etre nul!");
        nomVille = Objects.requireNonNull(nomville, "Le nom de la ville ne peut pas etre nul!");
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

    public final ETypeAdr getTypeAdr(){
        return this.typeAdr;
    }

    @Override
    public String toString(){
        return numRue + " " + nomRue + "\n" + nomVille + "\n";
    }
}

