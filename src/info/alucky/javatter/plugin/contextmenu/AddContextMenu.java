package info.alucky.javatter.plugin.contextmenu;

import javax.swing.JTextArea;

import com.orekyuu.javatter.main.Main;
import com.orekyuu.javatter.plugin.JavatterPlugin;

/**
 * プラグインのエントリポイント
 * @author alucky0707
 */
public class AddContextMenu extends JavatterPlugin{
	private ShowPopupMenuListener popupMenuListener;

	@Override
	public void init() {
		JTextArea textArea = Main.getMainView().getTweetTextArea();

		popupMenuListener = new ShowPopupMenuListener(textArea);
		textArea.addMouseListener(popupMenuListener);
   }

	@Override
	public String getPluginName() {
		return "AddContextMenu";
   }

	@Override
	public String getVersion() {
		return "0.0.1";
	}

}