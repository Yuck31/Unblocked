package UnBlocked.Entities;
/**
 * 
 */
import org.joml.Vector2f;

import UnBlocked.Level;

public abstract class Entity
{
    //Level.
    protected Level level = null;

    //Position.
    protected Vector2f position = new Vector2f();
    protected int tileX, tileY;

    /**Constructor.*/
    public Entity(int tileX, int tileY)
    {
        this.tileX = tileX;
        this.tileY = tileY;
        position.set(tileX << Level.TILE_BITS, tileY << Level.TILE_BITS);
    }

    /**Update function.*/
    public void update(float timeMod){}
}
