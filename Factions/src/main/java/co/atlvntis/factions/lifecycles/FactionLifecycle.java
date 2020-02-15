package co.atlvntis.factions.lifecycles;

import co.atlvntis.atlantida.lifecycle.Lifecycle;
import co.atlvntis.factions.AtlantidaFactions;
import co.atlvntis.factions.repositories.FactionRepository;

public class FactionLifecycle extends Lifecycle<AtlantidaFactions> {

    private FactionRepository factionRepository;

    public FactionLifecycle(AtlantidaFactions plugin) {
        super(plugin,10);
    }

    @Override
    public void load() {
        this.factionRepository = new FactionRepository(plugin);
    }
}
