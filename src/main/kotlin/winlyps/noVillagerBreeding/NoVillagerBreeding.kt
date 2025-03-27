package winlyps.noVillagerBreeding

import org.bukkit.plugin.java.JavaPlugin

/**
 * Main plugin class for NoVillagerBreeding
 */
class NoVillagerBreeding : JavaPlugin() {

    override fun onEnable() {
        logger.info("NoVillagerBreeding has been enabled")
        server.pluginManager.registerEvents(VillagerBreedingListener(this), this)
    }

    override fun onDisable() {
        logger.info("NoVillagerBreeding has been disabled")
    }
}