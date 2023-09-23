package firzmc.banana;
import firzmc.banana.item.ModItemGroups;
import firzmc.banana.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BananaMod implements ModInitializer {
	public static final String MOD_ID = "banana";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}