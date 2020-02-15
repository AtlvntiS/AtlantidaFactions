package co.atlvntis.factions.entities;

import lombok.Getter;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

@Getter
public class Faction {

    private final FactionInfo info;
    private final FactionNexus nexus;
    private final Map<FactionMember, FactionRole> members;
    private final Set<FactionChunk> claims;

    public Faction(FactionInfo info, FactionNexus nexus) {
        this.info = info;
        this.nexus = nexus;
        this.members = new TreeMap<>();
        this.claims = new TreeSet<>();
    }
}
