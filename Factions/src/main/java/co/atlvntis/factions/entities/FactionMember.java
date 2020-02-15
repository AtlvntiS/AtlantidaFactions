package co.atlvntis.factions.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FactionMember implements Comparable<FactionMember> {

    private final String name;

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        else if (obj instanceof FactionMember) return ((FactionMember) obj).getName().equals(name);
        else return false;
    }

    @Override
    public int compareTo(FactionMember factionMember) {
        return Integer.compare(name.hashCode(), factionMember.getName().hashCode());
    }

}
