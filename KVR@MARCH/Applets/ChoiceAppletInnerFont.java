
public abstract class java.awt.Graphics extends java.lang.Object
{
    protected java.awt.Graphics();
    public abstract java.awt.Graphics create();
    public java.awt.Graphics create(int, int, int, int);
    public abstract void translate(int, int);
    public abstract java.awt.Color getColor();
    public abstract void setColor(java.awt.Color);
    public abstract void setPaintMode();
    public abstract void setXORMode(java.awt.Color);
    public abstract java.awt.Font getFont();
    public abstract void setFont(java.awt.Font);
    public java.awt.FontMetrics getFontMetrics();
    public abstract java.awt.FontMetrics getFontMetrics(java.awt.Font);
    public abstract java.awt.Rectangle getClipBounds();
    public abstract void clipRect(int, int, int, int);
    public abstract void setClip(int, int, int, int);
    public abstract java.awt.Shape getClip();
    public abstract void setClip(java.awt.Shape);
    public abstract void copyArea(int, int, int, int, int, int);
    public abstract void drawLine(int, int, int, int);