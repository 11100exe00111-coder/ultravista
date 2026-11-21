package com.ultravista;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltraVistaMod implements ModInitializer {
    public static final String MOD_ID = "ultravista";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("UltraVista 1.0.0-zalith starting.");

        // Still Life changes terrain generation. UltraVista only
        // reads the finished heightmap — it never replaces it.
        if (isStillLifePresent()) {
            LOGGER.info("Still Life detected — COMPAT MODE enabled.");
            LOGGER.info("Using gentle terrain smoothing + distant horizon only.");
        } else {
            LOGGER.info("Still Life not detected — standard horizon mode.");
        }
    }

    private boolean isStillLifePresent() {
        try {
            Class.forName("com.stilllife.StillLifeMod");
            return true;
        } catch (ClassNotFoundException ignored) {
            return false;
        }
    }
                        }
