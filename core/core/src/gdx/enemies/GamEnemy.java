package gdx.enemies;

import com.badlogic.gdx.Game;
public class GamEnemy  extends Game {
 @Override
       public void create() {
       this.setScreen(new ScrEnemy(this));
       }
 @Override
       public void render() {
       super.render();
       }       

}