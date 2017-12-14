package application.Charakter;

import application.Charakterwerte;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class CharakterPane extends Pane{

	private Charakter chara;
	
	public CharakterPane(){
		this.setPrefSize(1000, 750);
		
		
		
		
	}
	
	private WertBox createChWert(Pane pane, int x, int y, Charakterwerte chw, Charakter chara){
		
		if(!chw.toString().equals(Charakterwerte.AP)){
			return new WertBox(chw,true, chara.getWert());
		}else{
			return new WertBox(chw,false, chara.getWert());
		}
	}
	
	
	
	
	
	
	
}
