package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	private Music rainMusic;
	
	@Override
	public void create () {
		// Load spritebatch
		batch = new SpriteBatch();
		
		// Load Images
		
		// Load sound/music
		rainMusic = Gdx.audio.newMusic(Gdx.files.internal("mus_sansdate.ogg"));
		rainMusic.setLooping(true);
		rainMusic.play();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void dispose () {

	}
}
