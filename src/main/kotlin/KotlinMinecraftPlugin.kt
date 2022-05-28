import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class KotlinMinecraftPlugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("onEnable")
        Bukkit.getPluginManager().registerEvents(Events(), this)
    }
}