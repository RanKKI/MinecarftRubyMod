package xyz.rankki.ruby.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.rankki.ruby.blocks.Blocks;
import xyz.rankki.ruby.items.Items;

public class ClientProxy extends Proxy {


    @Override
    public void preinit(FMLPreInitializationEvent event) {
        super.preinit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        Items.registerTextures();
        Blocks.registerTextures();
    }
}
