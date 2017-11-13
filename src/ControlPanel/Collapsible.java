package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Collapsible extends HBox {
	public CheckBox cbCollapsible	= new CheckBox();

	public Collapsible()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		cbCollapsible.setMinWidth(125);
		cbCollapsible.setMaxWidth(125);
		cbCollapsible.setText("Collapsible");
		cbCollapsible.setTooltip(new ControlPanelTooltip("Set the radial menu as collapsible or not"));
		if(MainFrm.collapsible)
			cbCollapsible.setSelected(true);

		getChildren().add(cbCollapsible);

		cbCollapsible.setOnAction(new EventHandler<ActionEvent>() {
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
