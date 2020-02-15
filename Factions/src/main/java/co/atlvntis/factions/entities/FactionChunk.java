package co.atlvntis.factions.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class FactionChunk implements Comparable<FactionChunk> {

    private final int x;
    private final int z;

    public String getVectorString() {
        return x + "," + z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        else if (obj instanceof FactionChunk) return ((FactionChunk) obj).getVectorString().equals(getVectorString());
        else return false;
    }

    @Override
    public int hashCode() {
        return getVectorString().hashCode();
    }

    @Override
    public int compareTo(FactionChunk factionChunk) {
        return Integer.compare(getVectorString().hashCode(), factionChunk.getVectorString().hashCode());
    }

}
