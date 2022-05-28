package com.wordolon.simplemod.init;

import com.wordolon.simplemod.items.ItemTitaniumSword;
import com.wordolon.simplemod.items.ItemUraniumIngot;
import com.wordolon.simplemod.items.ItemUraniumSword;
import com.wordolon.simplemod.main.SimpleMod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class InitItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Just items
	
	public static final Item URANIUM_INGOT = new ItemUraniumIngot("uranium_ingot", 64);
	public static final Item URANIUM_SWORD = new ItemUraniumSword("uranium_sword", SimpleMod.UraniumSwordMaterial );
	public static final Item TITANIUM_SWORD = new ItemTitaniumSword( "titanium_sword", SimpleMod.TitaniumSwordMaterial );
	
}
