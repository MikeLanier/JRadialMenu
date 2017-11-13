package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class InnerRadius extends HBox {
	public TextField tfInnerRadius			= new TextField();
	
	public InnerRadius()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		getChildren().add(ControlPanel.Marker("Inner Radius", 125, false));
		getChildren().add(ControlPanel.Spacer());

		Integer cs = MainFrm.innerRadius;
		tfInnerRadius.setText(cs.toString());
		tfInnerRadius.setMinWidth(40);
		tfInnerRadius.setMaxWidth(40);
		tfInnerRadius.setTooltip(new ControlPanelTooltip("set the size of the inner radius"));
		getChildren().add(tfInnerRadius);

		tfInnerRadius.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				MazeGlobal.sizeCell = Integer.parseInt(tfInnerRadius.getText());
				System.out.println("OnAction: tfInnerRadius");
//				mainFrm.mazePanel.resetMazePanel();
//				mainFrm.mazePanel.drawMaze();
			}
		});

	}
}
