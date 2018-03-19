package com.thewandererraven.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thewandererraven.tutorialmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COFFEE_BEANS_ORE_BLOCK = new BlockBase("coffee_beans_ore_block", Material.ROCK);
}
