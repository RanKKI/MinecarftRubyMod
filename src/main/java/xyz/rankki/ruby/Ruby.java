package xyz.rankki.ruby;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import xyz.rankki.ruby.proxy.Proxy;

@Mod(modid = Ruby.modid, useMetadata = true)
public class Ruby {

    public static final String modid = "ruby";

    @SidedProxy(clientSide = "xyz.rankki.ruby.proxy.ClientProxy",
            serverSide = "xyz.rankki.ruby.proxy.Proxy")
    private static Proxy proxy;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preinit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
