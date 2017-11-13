package DisplayPanel;

import RadialMenu.RadialMenu;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class DisplayPanel extends Canvas {
//	RadialMenu radialMenu = null;
	public DisplayPanel()
	{
		System.out.println("DisplayPanel");
//		radialMenu = new RadialMenu(50, 100, 8);
		this.setWidth(300);
		this.setHeight(300);
		this.setTranslateX(25);
		this.setTranslateY(25);
	}

	public void Update()
	{
		System.out.println("DisplayPanel:Update");
		GraphicsContext gc = getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillRect(0, 0, 300, 300);
		gc.setStroke(Color.BLACK);
		gc.strokeLine(0, 0, 300, 300);
//		radialMenu.Update(gc);
	}
}
