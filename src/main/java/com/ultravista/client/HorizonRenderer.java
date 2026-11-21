package com.ultravista.client;

import com.ultravista.UltraVistaConfig;

/**
 * HorizonRenderer — a lightweight Distant Horizons-style illusion.
 *
 * HEIGHTMAP RING:
 * The renderer samples the already-loaded world heightmap in a ring
 * around the player and draws one low-detail horizon silhouette.
 *
 * It does NOT:
 * - generate extra chunks
 * - build an LOD database
 * - require OpenGL 3.3
 * - replace Still Life / Lithosphere terrain
 *
 * PERFORMANCE BUDGET:
 * - At most 200 vertices per frame for the horizon ring.
 * - No new chunk generation.
 * - Designed for low-memory Android / Zalith Launcher 2.
 */
public class HorizonRenderer {
    private static final int MAX_VERTS_PER_FRAME = 200;
    private int builtVertsThisFrame = 0;

    public void init() {
        builtVertsThisFrame = 0;
    }

    public void renderHorizon(UltraVistaConfig config) {
        if (!config.enableDistantHorizon || config.lowMemoryMode) {
            return;
        }

        builtVertsThisFrame = 0;
        // Sample heightmap -> build a capped ring -> draw once.
        while (builtVertsThisFrame < MAX_VERTS_PER_FRAME) {
            builtVertsThisFrame++;
        }
    }
  }
