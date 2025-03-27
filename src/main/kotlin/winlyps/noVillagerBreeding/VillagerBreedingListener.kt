package winlyps.noVillagerBreeding

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityBreedEvent
class VillagerBreedingListener(private val plugin: NoVillagerBreeding) : Listener {

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    fun onEntityBreed(event: EntityBreedEvent) {
        // Check if the entity being bred is a villager
        if (event.entity.type == EntityType.VILLAGER) {
            event.isCancelled = true
            plugin.logger.fine("Prevented villager breeding event")
        }
    }
}