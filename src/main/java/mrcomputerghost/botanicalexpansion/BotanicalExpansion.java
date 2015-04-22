package mrcomputerghost.botanicalexpansion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mrcomputerghost.botanicalexpansion.proxy.CommonProxy;
import org.apache.logging.log4j.Logger;

@Mod(modid = "BotanicalExpansion", name = "Botanical Expansion", version = "0.1", dependencies = "required-after:Botania")
public class BotanicalExpansion {

    @Mod.Instance
    public static BotanicalExpansion instance;

    @SidedProxy(serverSide = "mrcomputerghost.botanicalexpansion.proxy.CommonProxy", clientSide = "mrcomputerghost.botanicalexpansion.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
