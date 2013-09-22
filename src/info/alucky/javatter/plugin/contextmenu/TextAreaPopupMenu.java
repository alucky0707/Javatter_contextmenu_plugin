package info.alucky.javatter.plugin.contextmenu;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class TextAreaPopupMenu extends JPopupMenu {
	/**
	 * @see <a href="http://www.ne.jp/asahi/hishidama/home/tech/java/swing/JPopupMenu.html">参考</a>
	 * @param textArea 対象となるテキストエリア
	 */
	public TextAreaPopupMenu(JTextArea textArea) {
		ActionMap map = textArea.getActionMap();

		Action cut = map.get(DefaultEditorKit.cutAction);
		addMenu("切り取り(X)", cut, 'X', KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

		Action copy = map.get(DefaultEditorKit.copyAction);
		addMenu("コピー(C)", copy, 'C', KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

		Action paste = map.get(DefaultEditorKit.pasteAction);
		addMenu("貼り付け(V)", paste, 'V', KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));

		Action all = map.get(DefaultEditorKit.selectAllAction);
		addMenu("すべて選択(A)", all, 'A', KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
	}

	private void addMenu(String text, Action action, char mnemonic, KeyStroke ks) {
		JMenuItem item = new JMenuItem(action);

		if (text != null) item.setText(text);
		if (mnemonic != 0) item.setMnemonic(mnemonic);
		if (ks != null) item.setAccelerator(ks);

		this.add(item);
	}

}
