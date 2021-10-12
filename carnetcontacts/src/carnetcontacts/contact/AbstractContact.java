package carnetcontacts.contact;

abstract public class AbstractContact{
    protected String mNomContact;

    public Contact(){
        mNomContact = "John doe";
    }
    
    public Contact(final String nomContact, Coordonnees coord)
    {
        mNomContact = nomContact;
    }
    
    public String getNomContact(){
        return this.mNomContact;
    }
}