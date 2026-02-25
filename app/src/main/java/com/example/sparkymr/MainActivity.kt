package com.example.sparkymr

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.graphics.Color
import com.meta.spatial.core.Color4
import com.meta.spatial.core.Entity
import com.meta.spatial.core.Pose
import com.meta.spatial.core.Vector3
import com.meta.spatial.toolkit.AppSystemActivity
import com.meta.spatial.toolkit.Material
import com.meta.spatial.toolkit.Mesh
import com.meta.spatial.toolkit.SpatialActivityManager
import com.meta.spatial.toolkit.Transform

class MainActivity : AppSystemActivity() {

    private lateinit var ghostEntity: Entity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SparkyMR", "App initialized! Creating Ghost Sphere.")
    }


    override fun onSceneReady() {
        super.onSceneReady()
        createGhostSphere()
    }

    private fun createGhostSphere() {
        // Create an entity in the spatial scene
        ghostEntity = Entity.create(
            listOf(
                // 1. Give it a visual representation: A Sphere Mesh
                Mesh(Uri.parse("mesh://sphere")), // Default procedural sphere
                
                // 2. Give it a cool glowing material (cyan glow for our "Ghost")
                Material().apply {
                    baseColor = Color4(0f, 1f, 1f, 1f) // Cyan (R, G, B, A)
                    metallic = 0.8f
                    roughness = 0.2f
                },
                
                // 3. Position it in the world (e.g. 50cm in front of the user)
                Transform(Pose(Vector3(0f, 0f, -0.5f)))
            )
        )
        Log.d("SparkyMR", "Ghost Sphere successfully added to the scene!")
    }
}
