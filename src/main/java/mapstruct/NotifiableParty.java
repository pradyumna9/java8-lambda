package mapstruct;

public class NotifiableParty {
   private String notifiablePartyName;

    public NotifiableParty(String notifiablePartyName) {
        this.notifiablePartyName = notifiablePartyName;
    }

    public String getNotifiablePartyName() {
        return notifiablePartyName;
    }

    public void setNotifiablePartyName(String notifiablePartyName) {
        this.notifiablePartyName = notifiablePartyName;
    }

    @Override
    public String toString() {
        return "NotifiableParty{" +
                "notifiablePartyName='" + notifiablePartyName + '\'' +
                '}';
    }
}
