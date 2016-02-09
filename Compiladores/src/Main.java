
public class Main {

	public static void main(String[] args) {
		//Corpo do Main
		while(true) {
      Token t = lexer.next();
      if (t instanceof EOF) break;
      System.out.print(t.getText());
}
	}

}
