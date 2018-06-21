package xyz.rankki.ruby.items;

public class Items {

    public static PickaxeRuby pickaxeRuby = new PickaxeRuby();
    public static IngotRuby ingotRuby = new IngotRuby();

    public static void register() {
        ingotRuby.register();
        pickaxeRuby.register();
    }

    public static void registerTextures() {
        ingotRuby.registerTextures();
        pickaxeRuby.registerTextures();
    }

}
