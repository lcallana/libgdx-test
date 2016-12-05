package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.GdxGame;

import scenes.Hud;

public class PlayScreen implements Screen {
	
	private GdxGame game;
	private OrthographicCamera camera;
	private FitViewport viewport;
	private Hud hud;
	
	public PlayScreen(GdxGame game) {
		this.game = game;
		camera = new OrthographicCamera();
		viewport = new FitViewport(GdxGame.V_WIDTH, GdxGame.V_HEIGHT, camera);
		hud = new Hud(game.batch);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
		hud.stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
	}
 
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
