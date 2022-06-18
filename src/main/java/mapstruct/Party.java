package mapstruct;

public class Party {
    private String partyName;

    public Party(String name) {
        this.partyName = name;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @Override
    public String toString() {
        return "Party{" +
                "name='" + partyName + '\'' +
                '}';
    }
}
