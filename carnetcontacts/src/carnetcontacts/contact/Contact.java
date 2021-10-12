package carnetcontacts.contact;

public class Contact{
    protected String mNomContact;
    private String mTelPortable;
    private String mTelFixe;
    private Adresse mAdresse;
    
    public Contact(final String nomContact,
            @Nullable final String telPort, 
            @Nullable final String telFixe,
            @Nullable final String adresse)
            mNomContact = nomContact;
            mAdresse = adresse;
            mTelFixe = telFixe;
            mTelPortable = telPort;
    
}