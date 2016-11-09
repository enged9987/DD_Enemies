

package platformmovements;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

class sprEnemy {


    private float fX, fY, fVx, fVy, fXOrL, fXOrR, fYOr;
    String sFile;
    Texture txImg;
    private Sprite sprImg;

    public sprEnemy(String _sFile, float _fX, float _fY) {
        sFile = _sFile;
        fX = _fX;
        fY = _fY;
        txImg = new Texture(sFile);
        sprImg = new Sprite(txImg);
    }

    void update(float _fVx, float _fVy) {
        fX = (Gdx.graphics.getWidth()/10)*9;
        if(fX <= 0 ){
            fX = Gdx.graphics.getWidth();
        }
    }
    void HitDetection(){      
        
    }

    public Sprite getSprite() {
        return sprImg;
    }

    //@Override
    public float getX() {
        return fX;
    }
}