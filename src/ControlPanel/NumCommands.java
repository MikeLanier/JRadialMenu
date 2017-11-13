package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class NumCommands extends HBox {
	public TextField tfNumCommands			= new TextField();

	public NumCommands()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		getChildren().add(ControlPanel.Marker("Number of commands", 125, false));
		getChildren().add(ControlPanel.Spacer());

		Integer cs = MainFrm.numCommands;
		tfNumCommands.setText(cs.toString());
		tfNumCommands.setMinWidth(40);
		tfNumCommands.setMaxWidth(40);
		tfNumCommands.setTooltip(new ControlPanelTooltip("Set the number of commands"));
		getChildren().add(tfNumCommands);

		tfNumCommands.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				MazeGlobal.sizeCell = Integer.parseInt(tfNumCommands.getText());
				System.out.println("OnAction: tfNumCommands");
//				mainFrm.mazePanel.resetMazePanel();
//				mainFrm.mazePanel.drawMaze();
			}
		});

	}

}
