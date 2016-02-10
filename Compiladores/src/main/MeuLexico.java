package main;

import simpleAdder.lexer.Lexer;
import simpleAdder.node.*;
import simpleAdder.lexer.Lexer.State;

//Foi utilizado o exemplo encontrado na documentacao

public class MeuLexico extends Lexer{
	
private int count;
  private TInicioComentarioAninhado comment;
  private StringBuffer text;
  
  public MeuLexico(java.io.PushbackReader in)
  { super(in);
  }
  protected void filter()
  { 
    if(state.equals(State.COMMENT))
    { 
      if(comment == null)
      { 
        
        comment = (TInicioComentarioAninhado) token;
        text = new StringBuffer(comment.getText());
        count = 1;
        token = null; 
      }
      else
      { 
        text.append(token.getText()); 
        if(token instanceof TInicioComentarioAninhado)
          count++;
        else if(token instanceof TFimComentarioAninhado)
          count--;
        if(count != 0)
          token = null; 
        else
        { comment.setText(text.toString());
          token = comment; 
          state = State.NORMAL; 
          comment = null; 
        }
      }
    }
  }
}
