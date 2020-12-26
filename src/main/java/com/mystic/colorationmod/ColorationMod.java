package com.mystic.colorationmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

import static com.mystic.colorationmod.ItemGroupColoration.COLORATION;

public class ColorationMod implements ModInitializer {
	public static final String[] COLORS = {"amber", "anchor", "turquoise", "cornflower_blue", "persian_blue", "aquamarine", "vampire_black", "apricot", "arctic", "azure", "basil", "blonde", "blood", "blush", "bright_red", "bronze", "brunette", "bubblegum", "butterscotch", "canary", "cantaloupe", "caramel", "cerulean", "chartreuse", "chocolate", "cider", "cinnamon", "cloud", "cobalt", "crocodile", "daffodil", "dandelion", "dark_green", "denim", "dijon", "ebony", "eggnog", "eggplant", "eggshell", "fern", "flamingo", "flaxen", "forest", "fossil", "fuscia", "garnet", "ginger", "heather", "hickory", "honey", "hot_pink", "indigo", "jade", "jam", "juniper", "lavender", "light_pink", "lipstick", "macarone", "mahogany", "medallion", "midnight", "mint", "mocha", "moss", "navy", "olive", "onyx", "orange_red", "orchid", "parakeet", "peacock", "pear", "penny", "periwinkle", "pickle", "pine", "pistachio", "plum", "punch", "rasin", "raven", "rose", "rouge", "sable", "sage", "salmon", "sangria", "sapphire", "scarlet", "seafoam", "seaweed", "shamrock", "sky_blue", "slate", "smoke", "sparkle", "taffy", "tangerine", "tawny", "tiger", "violet", "walnut", "watermelon", "wine", "yam", "yellow_green"};

	@Override
	public void onInitialize() {
		for (String color : COLORS) {
			Identifier rainbow = new Identifier("colorationmod", color);
			Block.Settings blockSettings = FabricBlockSettings.of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.STONE).strength(2, 0.5f);
			Block sun = new Block(blockSettings);
			Item.Settings itemSettings = new Item.Settings().group(COLORATION);
			BlockItem sunItem = new BlockItem(sun, itemSettings);
			Registry.register(Registry.BLOCK, rainbow, sun);
			Registry.register(Registry.ITEM, rainbow, sunItem);
		}
	}
}
