package com.wordolon.simplemod.utils.handlers;

import com.wordolon.simplemod.mod_data.mod_data;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
	public static SoundEvent Smth;
	
	public static void RegisterSounds( )	{
		
	}
	
	
	
	private static SoundEvent registerSound( String name )	{
		ResourceLocation location = new ResourceLocation( mod_data.mod_Properties.MODID, name );
		
		SoundEvent event = new SoundEvent( location );
		
		event.setRegistryName( name );
		
		ForgeRegistries.SOUND_EVENTS.register( event );
		
		return event;
	}
	
}
