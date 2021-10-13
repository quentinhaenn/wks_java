package carnetcontacts.contact;

import org.graalvm.compiler.asm.AbstractAddress;

public class Coordonnees extends AbstractContact{
    private String telPort;
    private String telFixe;

    Coordonnees(String telp, String telf, AbstractAdress adr){
        telPort = telp;
        telFixe = telf;
    }
}