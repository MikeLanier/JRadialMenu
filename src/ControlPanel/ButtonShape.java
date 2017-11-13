package ControlPanel;

import MainFrm.MainFrm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ButtonShape extends HBox {
	public ComboBox<String> cbButtonShape	= new ComboBox<>();

	class Group2
	{
		String	title;
		int		index;

		Group2(String _title, int _index)
		{
			title =  _title;
			index = _index;
		}
	}

	public Group2 shapes[] = {
			new Group2("Wedges", 0),
			new Group2("Circles", 1)
	};

	public ButtonShape()
	{
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		getChildren().add(ControlPanel.Marker("Button shape", 125, false));
		getChildren().add(ControlPanel.Spacer());

		cbButtonShape.setMinWidth(150);
		cbButtonShape.setMaxWidth(150);
		cbButtonShape.setTooltip(new ControlPanelTooltip("select the shape of the button"));
		getChildren().add(cbButtonShape);

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("algorithms[" + i + "].title: " + shapes[i].title);
			cbButtonShape.getItems().add(shapes[i].title);
		}

		if(MainFrm.buttonShape == MainFrm.ButtonShape.eWedge)
			cbButtonShape.setValue(shapes[0].title);
		else if(MainFrm.buttonShape == MainFrm.ButtonShape.eCircle)
			cbButtonShape.setValue(shapes[1].title);

		cbButtonShape.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				MazeGlobal.sizeCell = Integer.parseInt(cbButtonShape.getText());
				System.out.println("OnAction: cbButtonShape");
//				mainFrm.mazePanel.resetMazePanel();
//				mainFrm.mazePanel.drawMaze();
			}
		});

	}

}
