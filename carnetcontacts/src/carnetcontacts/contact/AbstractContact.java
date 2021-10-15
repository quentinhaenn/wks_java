package carnetcontacts.contact;

abstract public class AbstractContact{
    protected String mNomContact;

    public AbstractContact(){
        mNomContact = "John doe";
    }
    
    public AbstractContact(final String nomContact, Coordonnees coord)
    {
        mNomContact = nomContact;
    }
    
    public String getNomContact(){
        return this.mNomContact;
    }
}