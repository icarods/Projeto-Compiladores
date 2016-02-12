package main;

import simpleAdder.lexer.Lexer;
import simpleAdder.node.*;
import simpleAdder.lexer.Lexer.State;

//Foi utilizado o exemplo encontrado na documentacao

public class MeuLexico extends Lexer{
	
private int count;
  private TInicioComentarioAninhado inicioComentario;
  private StringBuffer textoDoComentario;
  
  public MeuLexico(java.io.PushbackReader in)
  { super(in);
  }
  protected void filter()
  { 
    if(state.equals(State.COMMENT))
    { 
      if(inicioComentario == null)
      { 
        
        inicioComentario = (TInicioComentarioAninhado) token;
        textoDoComentario = new StringBuffer(inicioComentario.getText());
        count = 1;
        token = null; 
      }
      else
      { 
        textoDoComentario.append(token.getText()); 
        if(token instanceof TInicioComentarioAninhado)
          count++;
        else if(token instanceof TFimComentarioAninhado)
          count--;
        if(count != 0)
          token = null; 
        else
        { inicioComentario.setText(textoDoComentario.toString());
          token = inicioComentario; 
          state = State.NORMAL; 
          inicioComentario = null; 
        }
      }
    }
  }
}
