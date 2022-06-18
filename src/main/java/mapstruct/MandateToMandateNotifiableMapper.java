package mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface MandateToMandateNotifiableMapper {
    MandateToMandateNotifiableMapper INSTANCE = Mappers.getMapper(MandateToMandateNotifiableMapper.class);

    @Mapping(source = "mandateServiceIdentifier",target = "msi")
    @Mapping(source = "mandateReferenceNumber",target = "mref")
    public NotifiableMandate mandateToNotifiableMandateObject(Mandate mandate);
    default NotifiableMandate mandateToNotifiableMandate(Mandate mandate){
        List<NotifiableParty> notifiableParties = mapToParty(mandate);
        NotifiableMandate notifiableMandate = mandateToNotifiableMandateObject(mandate);
        notifiableMandate.setNotifiableParty(notifiableParties);
        return notifiableMandate;
    }
    @Mapping(source = "party",target ="notifiableParty" )
    default List<NotifiableParty> mapToParty(Mandate mandate){
        Party creditoParty = mandate.getCreditorParty();
        Party debtorParty = mandate.getDebtorParty();
        Party party = mandate.getParty();
        NotifiableParty notifiablePartyCreditor = INSTANCE.partyToNotifiableParty(creditoParty);
        NotifiableParty notifiablePartyDebtor = INSTANCE.partyToNotifiableParty(debtorParty);
        NotifiableParty notifiableParty = INSTANCE.partyToNotifiableParty(party);
        List<NotifiableParty> notifiableParties = new ArrayList<>();
        notifiableParties.add(notifiablePartyCreditor);
        notifiableParties.add(notifiablePartyDebtor);
        notifiableParties.add(notifiableParty);
        return  notifiableParties;

    }

    @Mapping(source = "partyName",target ="notifiablePartyName")
    public NotifiableParty partyToNotifiableParty(Party party);


}
