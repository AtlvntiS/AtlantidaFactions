package co.atlvntis.factions.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class FactionNexus {



    public static FactionNexus emptyNexus() {
        return new FactionNexus();
    }

}
