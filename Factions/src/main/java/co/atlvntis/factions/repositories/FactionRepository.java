package co.atlvntis.factions.repositories;

import co.atlvntis.atlantida.abstractions.PluginDependent;
import co.atlvntis.factions.AtlantidaFactions;
import co.atlvntis.factions.entities.Faction;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FactionRepository extends PluginDependent<AtlantidaFactions> {

    private final Map<String, Faction> factions;

    public FactionRepository(AtlantidaFactions plugin) {
        super(plugin);
        this.factions = new ConcurrentHashMap<>();
    }



}
