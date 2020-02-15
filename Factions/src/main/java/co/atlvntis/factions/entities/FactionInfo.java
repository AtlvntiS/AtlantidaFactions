package co.atlvntis.factions.entities;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FactionInfo {

    private final int id;
    private final String founder;
    private final String name;
    private final String tag;

    private final long createdAt;


}
