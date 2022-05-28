package com.wordolon.simplemod.items;

import com.wordolon.simplemod.init.InitItems;
import com.wordolon.simplemod.main.SimpleMod;
import com.wordolon.simplemod.utils.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemUraniumIngot extends Item implements IHasModel {
	public ItemUraniumIngot( String name, int MaxStackSize ) {
		
		setUnlocalizedName( name );
		setRegistryName( name );
		setCreativeTab( CreativeTabs.MATERIALS );
		setMaxStackSize( MaxStackSize );
		
		InitItems.ITEMS.add( this );
		
	}

	@Override
	public void registerModels() {
		
		SimpleMod.proxy.registerItemRenderer( this , 0, "inventory");
		
	}
}
