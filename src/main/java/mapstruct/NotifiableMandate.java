package mapstruct;

import java.util.List;

public class NotifiableMandate {
    private String msi;
    private String mref;
    private String country;
    private List<NotifiableParty> notifiableParty;
    private String fixedAmount;

    public NotifiableMandate(String msi, String mref, String country, List<NotifiableParty> notifiableParty, String fixedAmount) {
        this.msi = msi;
        this.mref = mref;
        this.country = country;
        this.notifiableParty = notifiableParty;
        this.fixedAmount = fixedAmount;
    }

    public String getMsi() {
        return msi;
    }

    public void setMsi(String msi) {
        this.msi = msi;
    }

    public String getMref() {
        return mref;
    }

    public void setMref(String mref) {
        this.mref = mref;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<NotifiableParty> getNotifiableParty() {
        return notifiableParty;
    }

    public void setNotifiableParty(List<NotifiableParty> notifiableParty) {
        this.notifiableParty = notifiableParty;
    }

    public String getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(String fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public String toString() {
        return "NotifiableMandate{" +
                "msi='" + msi + '\'' +
                ", mref='" + mref + '\'' +
                ", country='" + country + '\'' +
                ", notifiableParty=" + notifiableParty +
                ", fixedAmount='" + fixedAmount + '\'' +
                '}';
    }
}
