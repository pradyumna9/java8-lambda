package com.java8code;
import java.util.*;

import com.mycomp.model.Identification;
import com.mycomp.model.Party;
import com.mycomp.model.Person;
import com.sun.tools.javac.util.List;
import org.apache.commons.collections4.CollectionUtils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalTest {
    public static void main(String[] args) {

        Identification identification =new Identification();
       // identification.setIdentifier("123");
        identification.setDomain("LOTUS");

        Party party = new Party();
        party.setPartyName("CONGRESS");
        party.setIdentificationList(List.of(identification));

      Person person = new Person();
      person.setName("Pk");
      person.setAge(0);
      person.setUid("uid");
      person.setParties(Collections.singletonList(party));


        //pick the value if hand is there
        Optional<String> id = Optional.ofNullable(person)
                .map(Person::getParties)
                .flatMap(parties -> parties.stream().filter(party1 -> "CONGRESS".equals(party1.getPartyName())).map(Party::getIdentificationList).filter(Objects::nonNull).findFirst())
                .flatMap(identifications -> CollectionUtils.emptyIfNull(identifications).stream()
                        .filter(i -> "LOTUS".equals(i.getDomain())).map(Identification::getIdentifier).filter(Objects::nonNull).findFirst());
            id.ifPresent(System.out::println);
    }
}
