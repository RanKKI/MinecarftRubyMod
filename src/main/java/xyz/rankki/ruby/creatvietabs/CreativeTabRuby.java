package xyz.rankki.ruby.creatvietabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xyz.rankki.ruby.items.Items;

public class CreativeTabRuby extends CreativeTabs {

    public static final CreativeTabRuby instance = new CreativeTabRuby();

    private static final String label = "tabruby";

    public CreativeTabRuby() {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.ingotRuby);
    }
}
