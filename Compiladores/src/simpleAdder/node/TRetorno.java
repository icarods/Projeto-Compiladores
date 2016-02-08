/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TRetorno extends Token
{
    public TRetorno()
    {
        super.setText("return");
    }

    public TRetorno(int line, int pos)
    {
        super.setText("return");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRetorno(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRetorno(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRetorno text.");
    }
}
