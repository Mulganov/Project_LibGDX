package com.mulganov.project.libgdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mulganov.project.libgdx.Init.Inits;
import com.mulganov.project.libgdx.desktop.Init.MenuInit;

public class DesktopLauncher {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		Game game = new Game();
		new LwjglApplication(game, config);

//		Inits.Menu = new MenuInit();

	}
}
