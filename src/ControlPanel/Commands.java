package ControlPanel;

import MainFrm.MainFrm;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Commands extends VBox{

	public Commands() {
		javafx.geometry.Insets margin = new javafx.geometry.Insets(5, 5, 5, 5);
		paddingProperty().setValue(margin);

		HBox title = new HBox();
		getChildren().add(title);

		title.getChildren().add(ControlPanel.Marker("Commands", 125, false));

		HBox tree = new HBox();
		getChildren().add(tree);

		TreeItem<RadialMenu.Command> root = new TreeItem<RadialMenu.Command>(MainFrm.commands);
		root.setExpanded(true);

		for(int i=0, j=0; i<MainFrm.commands.subCommmands.size(); i++) {
			RadialMenu.Command cmd = MainFrm.commands.subCommmands.get(i);
			if(cmd != null) {
				if (!cmd.icon.isEmpty()) {
					Image img = new Image(getClass().getResource(cmd.icon).toString());
					ImageView iv = new ImageView(img);
					iv.setScaleX(0.75);
					iv.setScaleY(0.75);
					TreeItem item = new TreeItem<RadialMenu.Command>(cmd, iv);
					root.getChildren().add(j++, item);
				} else {
					TreeItem item = new TreeItem<RadialMenu.Command>(cmd);
					root.getChildren().add(j++, item);
				}
			}
		}

//		TreeItem<String> item21 = new TreeItem<String>("Item 2-1");
//		TreeItem<String> item22 = new TreeItem<String>("Item 2-2");
//		TreeItem<String> item23 = new TreeItem<String>("Item 2-3");
//		item2.getChildren().addAll(item21, item22, item23);

//		root.getChildren().addAll( item1, item2, item3 );

		TreeView<RadialMenu.Command> treeView = new TreeView<RadialMenu.Command>(root);
		tree.getChildren().add(treeView);
	}
}
