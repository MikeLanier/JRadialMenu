package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class OuterRadius extends HBox {
	public TextField tfOuterRadius			= new TextField();

	public OuterRadius()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		getChildren().add(ControlPanel.Marker("Outer Radius", 125, false));
		getChildren().add(ControlPanel.Spacer());

		Integer cs = MainFrm.outerRadius;
		tfOuterRadius.setText(cs.toString());
		tfOuterRadius.setMinWidth(40);
		tfOuterRadius.setMaxWidth(40);
		tfOuterRadius.setTooltip(new ControlPanelTooltip("Set the size of the outer radius"));
		getChildren().add(tfOuterRadius);

		tfOuterRadius.setOnAction(new EventHandler<ActionEvent>() {
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
