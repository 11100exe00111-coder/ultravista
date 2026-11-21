package com.ultravista.client;

import com.ultravista.UltraVistaConfig;
import net.fabricmc.api.ClientModInitializer;

public class UltraVistaClient implements ClientModInitializer {
    public static final UltraVistaConfig CONFIG = new UltraVistaConfig();
    public static final HorizonRenderer HORIZON = new HorizonRenderer();

    @Override
    public void onInitializeClient() {
        // Client-only rendering. No server logic lives here.
        HORIZON.init();
    }
}
