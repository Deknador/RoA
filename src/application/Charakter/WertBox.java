package application.Charakter;

import java.util.HashMap;

import application.Charakterwerte;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class WertBox extends HBox {

	private Text text, wert;
	
	private Button plus, minus;
	private VBox vbox;
	private Charakterwerte chw;

	
	
	public WertBox(Charakterwerte chw, boolean buttons, HashMap<Charakterwerte, Integer> chWert){
		this.text = new Text();
		this.wert = new Text();
		this.plus = new Button();
		this.minus = new Button();
		this.vbox = new VBox();
		this.chw = chw;
		
		
		this.text.setStyle("chText");
		this.text.setText(chw.toString()+":\t\t");
		this.wert.setStyle("chText");
		this.wert.setText(chWert.get(chw)+"");
		
		this.plus.setPrefSize(10, 10);
		this.plus.setText("+");
		this.minus.setPrefSize(10, 10);
		this.minus.setText("-");
		
		this.vbox.getChildren().addAll(plus,minus);
		this.getChildren().addAll(this.text, this.wert, this.vbox);
		
	}
	
	public int getWert() throws NumberFormatException{
		return Integer.parseInt(wert.getText());
	}

	public void setWert(int wert,HashMap<Charakterwerte, Integer> chWert) {
		this.wert.setText(wert+"");
		chWert.put(chw, wert);
	}

}
