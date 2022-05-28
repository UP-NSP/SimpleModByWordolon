package com.wordolon.simplemod.items;

import com.wordolon.simplemod.init.InitItems;
import com.wordolon.simplemod.main.SimpleMod;
import com.wordolon.simplemod.utils.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;

public class ItemTitaniumSword extends ItemSword implements IHasModel {
	public ItemTitaniumSword ( String name, ToolMaterial Material ) {
		super( Material );
		setUnlocalizedName( name );
		setRegistryName( name );
		setCreativeTab( CreativeTabs.COMBAT );
		
		
		InitItems.ITEMS.add( this );
		
	}

	@Override
	public void registerModels() {
		
		SimpleMod.proxy.registerItemRenderer( this , 0, "inventory");
		
	}
}
