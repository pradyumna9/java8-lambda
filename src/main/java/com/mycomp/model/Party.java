package com.mycomp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Data
@NoArgsConstructor
@SuperBuilder
public class Party {
    private String partyName;
    private List<Identification> identificationList;

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public List<Identification> getIdentificationList() {
        return identificationList;
    }

    public void setIdentificationList(List<Identification> identificationList) {
        this.identificationList = identificationList;
    }
}
