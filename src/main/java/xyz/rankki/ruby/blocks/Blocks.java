package xyz.rankki.ruby.blocks;

public class Blocks {

    public static BlockRuby blockRuby = new BlockRuby();
    public static BlockOreRuby blockOreRuby = new BlockOreRuby();

    public static void register() {
        blockRuby.register();
        blockOreRuby.register();
    }

    public static void registerTextures() {
        blockRuby.registerTextures();
        blockOreRuby.registerTextures();
    }
}
