 // Or Hadad / 308101591 / Beer Sheva

package graphics;

import java.awt.*;

/**
 *
 */


public interface IDrawable {
    public final static String PICTURE_PATH = "pictures\\";
    public void loadImages(String nm);
    public void drawObject(Graphics g);
    public String getColor();
}
