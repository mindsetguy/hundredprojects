import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Application {

	private JFrame frame__;
	private JTextPane editor__;
	
	private static final String MAIN_TITLE = "Application";
	private static final String DEFAULT_FONT_FAMILY = "SansSerif";
	private static final int DEFAULT_FONT_SIZE = 18;


	public static void main(String [] args)
			throws Exception {

		UIManager.put("TextPane.font", 
				new Font(DEFAULT_FONT_FAMILY, Font.PLAIN, DEFAULT_FONT_SIZE));
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
        SwingUtilities.invokeLater(new Runnable() {
		
			public void run() {
			
				new Application().createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {
	
		frame__ = new JFrame(MAIN_TITLE);
		editor__ = new JTextPane();
		JScrollPane editorScrollPane = new JScrollPane(editor__);

		editor__.setDocument(new DefaultStyledDocument());

		frame__.add(editorScrollPane, BorderLayout.CENTER);		
		frame__.setSize(900, 500);
		frame__.setLocation(150, 80);
		frame__.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame__.setVisible(true);
		
		editor__.requestFocusInWindow();
	}
}