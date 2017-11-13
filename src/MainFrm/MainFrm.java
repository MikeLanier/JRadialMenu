package MainFrm;

import RadialMenu.CommandEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainFrm extends GridPane
{

	public enum ButtonShape {
		eWedge,
		eCircle
	}

	public static int innerRadius = 50;
	public static int outerRadius = 100;
	public static int numCommands = 8;
	public static ButtonShape buttonShape = ButtonShape.eWedge;
	public static boolean collapsible = true;
	public static boolean moveable = true;
	public static RadialMenu.Command	commands = null;

	public MainFrm() {
		System.out.println("MainFrm.MainFrm");

		// define the grid layout as two columns and one row.
		ColumnConstraints col1 = new ColumnConstraints();
		ColumnConstraints col2 = new ColumnConstraints();
		ColumnConstraints col3 = new ColumnConstraints();
		col1.setPrefWidth(300);
		col2.setPercentWidth(50);
		col3.setPercentWidth(20);
		getColumnConstraints().addAll(col1, col2, col3);

		RowConstraints row1 = new RowConstraints();
		row1.setPercentHeight(100);
		getRowConstraints().addAll(row1);

		setGridLinesVisible(true);

		commands = new RadialMenu.Command(-2, "Commands", "Commands", "");
		commands.add(new RadialMenu.Command(1, "Forward", "Move forward one cell", "..\\Images\\Forward32.png"));
//		commands.add(new RadialMenu.Command(5, "Open Door", "Open Door", "..\\Images\\OpenDoor32.png"));
//		commands.add(null);
		commands.add(new RadialMenu.Command(3, "Turn Right", "Turn right", "..\\Images\\TurnRight32.png"));
//		commands.add(new RadialMenu.Command(8, "Retreat", "Run away", "..\\Images\\Retreat32.png"));
//		commands.add(null);
		commands.add(new RadialMenu.Command(4, "Turn Around", "Turn Around", "..\\Images\\TurnAround32.png"));
//		commands.add(new RadialMenu.Command(7, "Fight", "Fight", "..\\Images\\Fight32.png"));
//		commands.add(null);
		commands.add(new RadialMenu.Command(2, "Turn Left", "Turn left", "..\\Images\\TurnLeft32.png"));
//		commands.add(new RadialMenu.Command(6, "Get Item", "Get visible item", "..\\Images\\GetItem32.png"));
//		commands.add(null);


		DisplayPanel.DisplayPanel displayPanel;

		add(new ControlPanel.ControlPanel(this), 0, 0);
		add(displayPanel=new DisplayPanel.DisplayPanel(), 1, 0);
		add(new RadialMenu.RadialMenu(40, 100, commands),1, 0);

		addEventFilter(
				CommandEvent.RUN_COMMAND,
				event -> System.out.println(
						"Field filtered strike: " + event.getCommand()
				)
		);

		addEventHandler(
				CommandEvent.RUN_COMMAND,
				event -> System.out.println(
						"Field handled strike: " + event.getCommand().toString()
				)
		);

		VBox svgImages = new VBox();
		add(svgImages, 2, 0);

		String[] svgs = {
			"..\\images\\tux.svg",
			"..\\images\\glass.svg",
			"..\\images\\inkscape.file.svg",
			"..\\images\\inkscape.svg",
			"..\\images\\out_of_gamut_icon.svg",
			"..\\images\\sodipodi.svg",
			"..\\images\\tango_icons.svg",
			"..\\images\\too_much_ink_icon.svg"
		};

		double[] svgScale = {
			.25,
			.25,
			.25,
			.25,
			.25,
			.25,
			.25,
			.25
		};

		for(int i=0; i<1; i++) {
			WebView wv = new WebView();
			WebEngine we = wv.getEngine();
			we.load(getClass().getResource(svgs[i]).toString());
			double d = svgScale[i];
			wv.setScaleX(d);
			wv.setScaleY(d);
			svgImages.getChildren().add(wv);
		}

		displayPanel.Update();

		setOnKeyPressed(new javafx.event.EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event)
			{
			}
		});
	}

	public void OnKeyPressed(KeyEvent event)
	{
		System.out.println("OnKeyPressed: [" + event.getCode() + "]");
	}
}
