package com.vucabu.gameproject.app;

import android.app.Activity;
import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public abstract class BaseScene extends Scene {
    //---------------------------------------------
    // VARIABLES
    //---------------------------------------------

    protected Engine engine;
    protected Activity activity;
    protected ResourceManager resourcesManager;
    protected VertexBufferObjectManager vbom;
    protected Camera camera;

    //---------------------------------------------
    // CONSTRUCTOR
    //---------------------------------------------

    public BaseScene() {
        this.resourcesManager = ResourceManager.getInstance();
        this.engine = resourcesManager.engine;
        this.activity = resourcesManager.activity;
        this.vbom = resourcesManager.vbom;
        this.camera = resourcesManager.camera;
        createScene();
    }

    //---------------------------------------------
    // ABSTRACTION
    //---------------------------------------------

    public abstract void createScene();

    public abstract void onBackKeyPressed();

    public abstract SceneManager.SceneType getSceneType();

    public abstract void disposeScene();
}