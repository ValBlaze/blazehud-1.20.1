package valblaze.blazehud;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import valblaze.blazehud.item.CustomItem;

public class BlazeHud implements ModInitializer {

	public static final CustomItem CUSTOM_ITEM = new CustomItem(new FabricItemSettings());

	@Override
	public void onInitialize() {

	}
}