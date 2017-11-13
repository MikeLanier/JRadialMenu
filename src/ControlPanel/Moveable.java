package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;

public class Moveable extends HBox {
	public CheckBox cbMoveable	= new CheckBox();

	public Moveable()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		cbMoveable.setMinWidth(125);
		cbMoveable.setMaxWidth(125);
		cbMoveable.setText("Moveable");
		cbMoveable.setTooltip(new ControlPanelTooltip("Set the radial menu as Moveable or not"));
		getChildren().add(cbMoveable);
		if(MainFrm.moveable)
			cbMoveable.setSelected(true);

		cbMoveable.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				MazeGlobal.sizeCell = Integer.parseInt(tfOuterRadius.getText());
				System.out.println("OnAction: tfOuterRadius");
//				mainFrm.mazePanel.resetMazePanel();
//				mainFrm.mazePanel.drawMaze();
			}
		});

	}

}
