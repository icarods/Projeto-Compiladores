/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TParEs extends Token
{
    public TParEs()
    {
        super.setText("(");
    }

    public TParEs(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParEs(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParEs(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParEs text.");
    }
}
