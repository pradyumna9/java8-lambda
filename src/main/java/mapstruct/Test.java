package mapstruct;

import org.mapstruct.factory.Mappers;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MandateToMandateNotifiableMapper mapper = Mappers.getMapper(MandateToMandateNotifiableMapper.class);
            Mandate mandate = new Mandate("S123","Ref123","INR",new Party("Debtor"),new Party("Creditor"),new Party("CreditorAgent"));
            NotifiableMandate notifiableMandate = mapper.mandateToNotifiableMandate(mandate);
            System.out.println(notifiableMandate);
       // System.out.println(parties);
    }
}
