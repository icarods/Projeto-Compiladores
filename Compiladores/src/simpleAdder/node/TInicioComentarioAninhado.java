/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TInicioComentarioAninhado extends Token
{
    public TInicioComentarioAninhado()
    {
        super.setText("/*");
    }

    public TInicioComentarioAninhado(int line, int pos)
    {
        super.setText("/*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInicioComentarioAninhado(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInicioComentarioAninhado(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInicioComentarioAninhado text.");
    }
}