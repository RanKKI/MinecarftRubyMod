package xyz.rankki.ruby.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.rankki.ruby.Ruby;

public class IngotRuby extends Item {

    private static final String name = "IngotRuby";
    public static final String registryName = Ruby.modid + ":" + name;
    private static final String unlocalizedName = Ruby.modid + "." + name;

    public IngotRuby() {
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    public void register() {
        ForgeRegistries.ITEMS.register(this);
    }

    public void registerTextures() {
        Minecraft.getMinecraft().getRenderItem()
                .getItemModelMesher()
                .register(this, 0,
                        new ModelResourceLocation(IngotRuby.registryName, "inventory"));
    }
}
