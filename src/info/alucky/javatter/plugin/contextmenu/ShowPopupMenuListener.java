package info.alucky.javatter.plugin.contextmenu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

public class ShowPopupMenuListener implements MouseListener {
	private JTextArea textArea;
	private TextAreaPopupMenu popup;

	public ShowPopupMenuListener(JTextArea textArea) {
		this.textArea = textArea;

		this.popup = new TextAreaPopupMenu(textArea);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public TextAreaPopupMenu getPopup() {
		return popup;
	}

	public void setPopup(TextAreaPopupMenu popup) {
		this.popup = popup;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		showPopup(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		showPopup(e);
	}

	/**
	 * ポップアップメニューの表示の移譲先
	 * @param e イベントリスナーをそのまま
	 */
	private void showPopup(MouseEvent e) {
		if (e.isPopupTrigger()) {
			popup.show(textArea, e.getX(), e.getY());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//nop
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//nop
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//nop
	}

}
