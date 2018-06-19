package xyz.rankki.ruby.generator;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.rankki.ruby.Ruby;

import java.util.Random;

public class OreRubyGenerator implements IWorldGenerator {

    public static void init() {
        GameRegistry.registerWorldGenerator(new OreRubyGenerator(), 0);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = 13 + random.nextInt(50);
            int z = chunkZ * 16 + random.nextInt(16);

            IBlockState blockState = Ruby.blockOreRuby.getDefaultState();
            WorldGenMinable worldGenMinable = new WorldGenMinable(blockState, 20);
            worldGenMinable.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
