package xyz.rankki.ruby.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.rankki.ruby.Ruby;
import xyz.rankki.ruby.creatvietabs.CreativeTabRuby;

public class BlockRuby extends Block {

    private static final String name = "BlockRuby";
    public static final String registryName = Ruby.modid + ":" + name;
    private static final String unlocalizedName = Ruby.modid + "." + name;

    public BlockRuby() {
        this(Material.ROCK);
    }

    public BlockRuby(Material materialIn) {
        super(materialIn);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabRuby.instance);
    }

    public void register() {
        ForgeRegistries.BLOCKS.register(this);
        ForgeRegistries.ITEMS.register(new ItemBlock(this).setRegistryName(registryName));
    }

    public void registerTextures() {
        Minecraft.getMinecraft().getRenderItem()
                .getItemModelMesher()
                .register(Item.getItemFromBlock(this), 0,
                        new ModelResourceLocation(registryName, "inventory"));
    }
}
