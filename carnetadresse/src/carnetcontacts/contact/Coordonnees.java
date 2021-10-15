package carnetcontacts.contact;

import java.util.Objects;
import carnetcontacts.adresse.AbstractAdresse;

public class Coordonnees {
    private String telPort;
    private String telFixe;

    public Coordonnees(String telp, String telf, AbstractAdresse adr){
        telPort = Objects.requireNonNull(telp, "Le telephone portable ne peut pas etre nul");
        telFixe = Objects.requireNonNull(telf, "Le telephone fixe ne peut pas etre nul");
    }
    
    public String getTelPort(){
        return telPort;
    }

    public String getTelFixe(){
        return telFixe;
    }
}