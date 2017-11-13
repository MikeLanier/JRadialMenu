package ControlPanel;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class ControlPanel extends VBox {


	public static Label Marker(String title, int size, boolean disabled)
	{
		Label lbl = new Label();
		lbl.setText(title);
		if(size > 0) {
			lbl.setMinWidth(size);
			lbl.setMaxWidth(size);
		}
		lbl.setDisable(disabled);
		return lbl;
	}

	public static Label Spacer()
	{
		return Marker("", 5, false);
	}

	private MainFrm.MainFrm mainFrm;

	private InnerRadius _innerRadius = null;
	private OuterRadius _outerRadius = null;
	private NumCommands _numCommands = null;
	private ButtonShape _buttonShape = null;
	private Collapsible _collapsible = null;
	private Moveable _moveable = null;
	private Commands _commands = null;

	public ControlPanel(MainFrm.MainFrm _mainFrm)
	{
		System.out.println("ControlPanel");

		mainFrm = _mainFrm;
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		setMargin(this, margin);

		getChildren().add(_innerRadius = new InnerRadius());
		getChildren().add(_outerRadius = new OuterRadius());
		getChildren().add(_numCommands = new NumCommands());
		getChildren().add(_buttonShape = new ButtonShape());
		getChildren().add(_collapsible = new Collapsible());
		getChildren().add(_moveable = new Moveable());
		getChildren().add(_commands = new Commands());
	}
}
