package com.ultravista;

public class UltraVistaConfig {
    // Distance of the lightweight horizon ring, in blocks.
    public int horizonDistance = 512;

    // Keep the real Minecraft render distance low on phone.
    public int vanillaRenderDistance = 6;

    public boolean enableTerrainSmoothing = true;
    public boolean enableErosion = true;
    public boolean enableDistantHorizon = true;
    public boolean stillLifeCompat = true;
    public boolean lowMemoryMode = true;

    // 0.0 = clear, 1.0 = heavy haze.
    public float fogDensity = 0.55f;
}
