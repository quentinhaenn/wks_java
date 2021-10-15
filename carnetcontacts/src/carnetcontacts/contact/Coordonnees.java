package carnetcontacts.contact;


import carnetcontacts.adresse.AbstractAdresse;

public class Coordonnees extends AbstractContact{
    private String telPort;
    private String telFixe;
    private AbstractAdresse adresse;

    Coordonnees(String telp, String telf, AbstractAdresse adr){
        telPort = telp;
        telFixe = telf;
        adresse = adr;
    }

    Coordonnees(String telp, String telf) {
        telPort = telp;
        telFixe = telf;
        adresse = null;
    }


    public String getTelPort() {
        return telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public String getAdresse() {
        return adresse.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Coordonnees)) {
            return false;
        }
        Coordonnees coordonnees = (Coordonnees) obj;
        if(!(telPort.equals(coordonnees.telPort) && telFixe.equals(coordonnees.telFixe))) {
            return false;
        }else if (adresse == null) {

            if (coordonnees.adresse != null) {
                return false;
            } else {
                return true;
            }
        } else if (adresse.equals(coordonnees.adresse)) {
            return true;
            }
        return false;
        }

}