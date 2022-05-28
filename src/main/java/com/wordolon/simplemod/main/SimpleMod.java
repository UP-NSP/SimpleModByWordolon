package com.wordolon.simplemod.main;

import com.wordolon.simplemod.mod_data.mod_data.mod_Properties;
import com.wordolon.simplemod.mod_data.mod_data.proxies;
import com.wordolon.simplemod.proxy.CommonProxy;
import com.wordolon.simplemod.utils.handlers.SoundHandler;

import net.minecraft.init.Blocks;
import com.wordolon.simplemod.items.ItemUraniumSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = mod_Properties.MODID, name = mod_Properties.NAME, version = mod_Properties.VERSION, acceptedMinecraftVersions = mod_Properties.MINECRAFT_VERSION )
public class SimpleMod
{
	public static ToolMaterial UraniumSwordMaterial;
	
	public static ToolMaterial TitaniumSwordMaterial; 
	
	@Instance
	public static SimpleMod instance;
	
	@SidedProxy( clientSide = proxies.CLIENT, serverSide = proxies.COMMON_PROXY )
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        UraniumSwordMaterial = EnumHelper.addToolMaterial( "uranium_sword", 0, 5000, 5, 10, 30);
        TitaniumSwordMaterial = EnumHelper.addToolMaterial("titanium_sword", 1, 10000, 5, 15, 30);
    };

    @EventHandler
    public void init(FMLInitializationEvent event) {
       
    	SoundHandler.RegisterSounds();
       
    };
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
       
       
    };
}
