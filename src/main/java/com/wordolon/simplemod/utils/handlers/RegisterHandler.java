package com.wordolon.simplemod.utils.handlers;

import com.wordolon.simplemod.init.InitItems;
import com.wordolon.simplemod.utils.interfaces.IHasModel;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

@EventBusSubscriber
public class RegisterHandler {

	@SubscribeEvent
	public static void onItemRegister( RegistryEvent.Register<Item> event ) {
		
		event.getRegistry().registerAll( InitItems.ITEMS.toArray( new Item[0] ) ); 		
	}
	
	@SubscribeEvent
	public static void onModelRegister( ModelRegistryEvent event ) {
		
		for ( Item item : InitItems.ITEMS )
		{
			if ( item instanceof IHasModel )
			{
				((IHasModel)item).registerModels();
			}
		}
		
	}
}
