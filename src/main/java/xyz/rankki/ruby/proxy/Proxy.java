package xyz.rankki.ruby.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.rankki.ruby.blocks.Blocks;
import xyz.rankki.ruby.generator.OreRubyGenerator;
import xyz.rankki.ruby.items.Items;

public class Proxy {

    public void preinit(FMLPreInitializationEvent event) {
        Items.register();
        Blocks.register();
    }

    public void init(FMLInitializationEvent event) {
        OreRubyGenerator.init();
    }

}
