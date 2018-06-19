package xyz.rankki.ruby;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.logging.log4j.Logger;
import xyz.rankki.ruby.blocks.BlockOreRuby;
import xyz.rankki.ruby.blocks.BlockRuby;
import xyz.rankki.ruby.generator.OreRubyGenerator;
import xyz.rankki.ruby.items.IngotRuby;

@Mod(modid = Ruby.modid, useMetadata = true)
public class Ruby {

    public static final String modid = "ruby";

    @SidedProxy
    private static ServerProxy proxy;
    public static Logger logger;
    public static IngotRuby ingotRuby;
    public static BlockRuby blockRuby;
    public static BlockOreRuby blockOreRuby;

    private void initVar(FMLPreInitializationEvent event){
        logger = event.getModLog();
        ingotRuby = new IngotRuby();
        blockRuby = new BlockRuby();
        blockOreRuby = new BlockOreRuby();
    }

    private void register(){
        ingotRuby.register();
        blockRuby.register();
        blockOreRuby.register();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        initVar(event);
        register();
        OreRubyGenerator.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.loadModel();
    }

    public static class ServerProxy {
        public void loadModel() {
        }
    }

    public static class ClientProxy extends ServerProxy {
        @Override
        public void loadModel() {
            super.loadModel();
            ingotRuby.registerTextures();
            blockRuby.registerTextures();
            blockOreRuby.registerTextures();
        }
    }
}
