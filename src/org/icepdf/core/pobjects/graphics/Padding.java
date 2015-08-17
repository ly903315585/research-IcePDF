package org.icepdf.core.pobjects.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;
import org.icepdf.core.application.ProductInfo;

public class Padding
{
  private static byte[] padding1 = { };
  private static byte[] padding3 = { };
  //private static byte[] padding1 = { 54, 48, 50, 93, 81, 83, 13 };
  //private static byte[] padding3 = { 51, 92, 95, 13, 50, 99, 78, 89, 98, 78, 97, 86, 92, 91, 13, 61, 98, 95, 93, 92, 96, 82, 96, 13, 60, 91, 89, 102 };
  
  public static final void getPadding(Graphics2D paramGraphics2D, Rectangle2D.Float paramFloat)
  {
    paramGraphics2D.scale(1.0D, -1.0D);
    paramGraphics2D.setColor(new Color(186, 0, 0));
    String str1 = new ProductInfo().getVersion();
    String str2 = new String(padding1) + str1;
    String str3 = new String(padding3);
    int i = 5;
    paramGraphics2D.setFont(new Font("Dialog", 1, 14));
    FontMetrics localFontMetrics = paramGraphics2D.getFontMetrics();
    Rectangle2D localRectangle2D = localFontMetrics.getStringBounds(str3.toCharArray(), 0, str3.length(), paramGraphics2D);
    int j = (int)(paramFloat.x + (paramFloat.width - localRectangle2D.getWidth()) / 2.0D);
    int k = -1 * i;
    paramGraphics2D.drawString(str3, j, k);
    localRectangle2D = localFontMetrics.getStringBounds(str2.toCharArray(), 0, str2.length(), paramGraphics2D);
    j = (int)(paramFloat.x + (paramFloat.width - localRectangle2D.getWidth()) / 2.0D);
    k = -1 * (int)(paramFloat.height - localRectangle2D.getHeight() - i);
    paramGraphics2D.drawString(str2, j, k);
  }
  
  static
  {
    for (int i = 0; i < padding1.length; i++)
    {
      int tmp226_225 = i;
      byte[] tmp226_222 = padding1;
      tmp226_222[tmp226_225] = ((byte)(tmp226_222[tmp226_225] + 19));
    }
    for (int i = 0; i < padding3.length; i++)
    {
      int tmp253_252 = i;
      byte[] tmp253_249 = padding3;
      tmp253_249[tmp253_252] = ((byte)(tmp253_249[tmp253_252] + 19));
    }
  }
}
