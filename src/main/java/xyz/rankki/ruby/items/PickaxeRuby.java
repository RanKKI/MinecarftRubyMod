package xyz.rankki.ruby.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.rankki.ruby.Ruby;

public class PickaxeRuby extends ItemPickaxe {

    private static final String name = "PickaxeRuby";
    public static final String registryName = Ruby.modid + ":" + name;
    private static final String unlocalizedName = Ruby.modid + "." + name;

    public PickaxeRuby() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setHarvestLevel("pickaxe", 3);
    }

    public void register() {
        ForgeRegistries.ITEMS.register(this);
    }

    public void registerTextures() {
        Minecraft.getMinecraft().getRenderItem()
                .getItemModelMesher()
                .register(this, 0,
                        new ModelResourceLocation(registryName, "inventory"));
    }
}
