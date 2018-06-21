package xyz.rankki.ruby.generator;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xyz.rankki.ruby.blocks.Blocks;

public class OreRubyGenerator {

    private static WorldGenMinable worldGenMinable = new WorldGenMinable(Blocks.blockOreRuby.getDefaultState(), 20);

    public static void init() {
        MinecraftForge.ORE_GEN_BUS.register(OreRubyGenerator.class);
    }

    @SubscribeEvent
    public static void onGenerateMinable(OreGenEvent.GenerateMinable event) {
        if (event.getType() != OreGenEvent.GenerateMinable.EventType.IRON) {
            return;
        }

        if (!TerrainGen.generateOre(event.getWorld(), event.getRand(), worldGenMinable, event.getPos(),
                OreGenEvent.GenerateMinable.EventType.CUSTOM)) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            int posX = event.getPos().getX() + event.getRand().nextInt(16);
            int posY = 16 + event.getRand().nextInt(40);
            int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
            worldGenMinable.generate(event.getWorld(), event.getRand(), new BlockPos(posX, posY, posZ));
        }
    }
}
