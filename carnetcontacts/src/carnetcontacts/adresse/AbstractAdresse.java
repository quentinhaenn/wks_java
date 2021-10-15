package carnetcontacts.adresse;

import java.util.Objects;

public abstract class AbstractAdresse {
    private static final int MULT_HASH_PRIME = 13;
    protected Integer numRue;
    protected String nomRue;
    protected String nomVille;
    protected ETypeAdr typeAdr;

    AbstractAdresse(Integer numrue,
                     String nomrue,
                     String nomville,
                     ETypeAdr typad){
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

    public final ETypeAdr getTypeAdr(){
        return this.typeAdr;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false ;}

        if (obj == this){
            return true;
        }

        if(!(obj instanceof AbstractAdresse)){
            return false;
        }

        AbstractAdresse adr = (AbstractAdresse) obj;
        //par contstruction ici les attributs ne peuvent pas être nuls
        // pas de test nécessaire, on compare directement

        if((adr.numRue.equals(numRue)) && (adr.nomRue.compareTo(nomRue) == 0)
                && (adr.nomVille.compareTo(nomVille) == 0) && (adr.typeAdr.equals(typeAdr))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        //Attributs non nuls par construction, pas de tests nécessaire

        hash = hash * MULT_HASH_PRIME + nomRue.hashCode();
        hash = hash * MULT_HASH_PRIME + numRue.hashCode();
        hash = hash * MULT_HASH_PRIME + nomVille.hashCode();
        hash = hash * MULT_HASH_PRIME + typeAdr.hashCode();
        return hash;
    }
}

