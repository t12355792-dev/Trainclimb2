package com.example.trainclimb;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TrainClimb.MODID, name = TrainClimb.NAME, version = TrainClimb.VERSION)
public class TrainClimb {
    public static final String MODID = "trainclimb";
    public static final String NAME = "Train Climb";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Инициализация предметов мода
    }
}
