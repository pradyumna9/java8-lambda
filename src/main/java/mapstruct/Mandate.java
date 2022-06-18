package mapstruct;

public class Mandate {
    private String mandateServiceIdentifier;
    private String mandateReferenceNumber;
    private String country;
    private Party party;
    private Party creditorParty;
    private Party debtorParty;

    public Mandate(String mandateServiceIdentifier, String mandateReferenceNumber, String country, Party party, Party creditorParty, Party debtorParty) {
        this.mandateServiceIdentifier = mandateServiceIdentifier;
        this.mandateReferenceNumber = mandateReferenceNumber;
        this.country = country;
        this.party = party;
        this.creditorParty = creditorParty;
        this.debtorParty = debtorParty;
    }

    public String getMandateServiceIdentifier() {
        return mandateServiceIdentifier;
    }

    public void setMandateServiceIdentifier(String mandateServiceIdentifier) {
        this.mandateServiceIdentifier = mandateServiceIdentifier;
    }

    public String getMandateReferenceNumber() {
        return mandateReferenceNumber;
    }

    public void setMandateReferenceNumber(String mandateReferenceNumber) {
        this.mandateReferenceNumber = mandateReferenceNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Party getCreditorParty() {
        return creditorParty;
    }

    public void setCreditorParty(Party creditorParty) {
        this.creditorParty = creditorParty;
    }

    public Party getDebtorParty() {
        return debtorParty;
    }

    public void setDebtorParty(Party debtorParty) {
        this.debtorParty = debtorParty;
    }
}
