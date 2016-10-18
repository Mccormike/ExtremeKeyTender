package mekel.view.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class TreePanel extends JPanel {
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JTree tree;

	private ImageIcon plus;

	private ImageIcon minus;

	private BorderLayout layout;

	public TreePanel() {
		super();
		plus = new ImageIcon("resource/img/plus.gif");
		minus = new ImageIcon("resource/img/minus.gif");
		initialize();
	}

	private void initialize() {

		/*
		 * Config
		 */
		layout = new BorderLayout(0,0);
		this.setBackground(Color.WHITE);
		this.setLayout(layout);

		tree = new JTree();
		tree.setBorder(new EmptyBorder(5,5,5,5));
		tree.setToggleClickCount(1);
		tree.setFont(new Font("Arial", Font.PLAIN, 12));
		tree.setRootVisible(false);
		tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Config") {
					private static final long serialVersionUID = 1L;

					{
						DefaultMutableTreeNode node_1;
						node_1 = new DefaultMutableTreeNode("Keyboard");
						node_1.add(new DefaultMutableTreeNode("Hotkeys/UI"));
						node_1.add(new DefaultMutableTreeNode("Movement/Vehicle"));
						node_1.add(new DefaultMutableTreeNode("Action Bars"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Mouse");
						node_1.add(new DefaultMutableTreeNode("Clicky"));
						add(node_1);
					}
				}
				));
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
		renderer.setLeafIcon(null);
		renderer.setClosedIcon(plus);
		renderer.setOpenIcon(minus);
		tree.expandRow(0);
		DefaultMutableTreeNode firstLeaf = ((DefaultMutableTreeNode)tree.getModel().getRoot()).getFirstLeaf();
		tree.setSelectionPath(new TreePath(firstLeaf.getPath()));
		this.add(tree, BorderLayout.NORTH);
	}
}
