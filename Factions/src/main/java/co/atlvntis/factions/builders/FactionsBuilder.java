package co.atlvntis.factions.builders;

import co.atlvntis.factions.entities.*;
import javafx.util.Builder;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FactionsBuilder implements Builder<Faction> {

    private final FactionMember creator;

    private int id = -1;
    private String name;
    private String tag;
    private String founder;

    private FactionInfo factionInfo;
    private FactionNexus factionNexus = FactionNexus.emptyNexus();

    private Map<FactionMember, FactionRole> members = new TreeMap<>();
    private Set<FactionChunk> claims = new TreeSet<>();

    private FactionsBuilder(FactionMember creator) {
        this.creator = creator;
    }

    public FactionsBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FactionsBuilder withTag(String tag) {
        this.tag = tag;
        return this;
    }

    public FactionsBuilder withFounder(String founder) {
        this.founder = founder;
        return this;
    }

    public FactionsBuilder withFactionInfo(FactionInfo factionInfo) {
        this.factionInfo = factionInfo;
        return this;
    }

    public FactionsBuilder withMembers(Map<FactionMember, FactionRole> members) {
        this.members.putAll(members);
        return this;
    }

    public FactionsBuilder withMember(FactionMember member, FactionRole role) {
        this.members.put(member, role);
        return this;
    }

    public FactionsBuilder withClaims(Set<FactionChunk> claim) {
        this.claims.addAll(claim);
        return this;
    }

    public FactionsBuilder withClaim(FactionChunk claim) {
        this.claims.add(claim);
        return this;
    }

    public FactionsBuilder withNexus(FactionNexus factionNexus) {
        this.factionNexus = factionNexus;
        return this;
    }

    @Override
    public Faction build() {

        if(name == null) throw new NullPointerException("FactionsBuilder: name cannot be null");
        if(tag == null) throw new NullPointerException("FactionsBuilder: tag cannot be null");

        FactionInfo fi = factionInfo != null ? factionInfo : new FactionInfo(id, founder, name, tag, System.currentTimeMillis());
        Faction faction = new Faction(fi, factionNexus);
        faction.getMembers().putAll(members);
        faction.getClaims().addAll(claims);

        return faction;

    }

    public static FactionsBuilder of(FactionMember factionMember) {
        return new FactionsBuilder(factionMember).withFounder(factionMember.getName());
    }

}
