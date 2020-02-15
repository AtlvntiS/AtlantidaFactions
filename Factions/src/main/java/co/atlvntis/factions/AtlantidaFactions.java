package co.atlvntis.factions;

import co.atlvntis.atlantida.AtlantidaPlugin;
import co.atlvntis.atlantida.exceptions.StateErrorException;
import co.atlvntis.factions.lifecycles.FactionLifecycle;
import lombok.Getter;

@Getter
public class AtlantidaFactions extends AtlantidaPlugin {

    private FactionLifecycle factionLifecycle = lifecycle(new FactionLifecycle(this));

    @Override
    protected void enable() throws StateErrorException {

    }

}
