package co.atlvntis.factions.entities;

import lombok.Getter;

@Getter
public enum FactionRole {

    LEADER(3, "Líder"),
    RESPONSIBLE(2, "Responsável"),
    TRUSTWORTHY(1, "Confiável"),
    MEMBER(0, "Membro");

    private final int id;
    private final String friendlyName;

    FactionRole(int id, String friendlyName) {
        this.id = id;
        this.friendlyName = friendlyName;
    }

}
