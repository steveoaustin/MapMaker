package debugMaps;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class FrameTest {
	
	public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
	
	public static void createAndShowGUI() {
		
		PanelTest map = new PanelTest();
		JPanel contentPanel = new JPanel();
		JScrollPane mapContainer = new JScrollPane(map);
		JFrame frame = new JFrame("DubMaps\u2122");
		JPanel controlPanel = new JPanel();
		JButton b = new JButton();	
		JButton b2 = new JButton();	
		JButton b3 = new JButton();	
		
		// configure button
		b.setText("this is a button");
		b.setVisible(true);
		b2.setText("this is a button");
		b2.setVisible(true);
		b3.setText("this is a button");
		b3.setVisible(true);
		
		// configure controlPanel		
		controlPanel.setBackground(Color.BLACK);
		FlowLayout f = new FlowLayout(FlowLayout.CENTER);
		controlPanel.setLayout(f);
		controlPanel.add(b);
		controlPanel.add(b2);
		controlPanel.add(b3);
		controlPanel.setVisible(true);
		controlPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
		
		// configure box layout
		BoxLayout box = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
		
		// configure contentPanel
		contentPanel.setLayout(box);
		contentPanel.setDoubleBuffered(true);
		contentPanel.setVisible(true);
		
		// configure frame
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setMinimumSize(new Dimension(400, 400));
		frame.setResizable(true);
		frame.setVisible(true);
		
		// configure scrollPane
		mapContainer.setDoubleBuffered(true);
		mapContainer.setPreferredSize(new Dimension(500, 500));
		mapContainer.setViewportView(map);
		mapContainer.setVisible(true);
		
		// add components
		contentPanel.add(controlPanel);
		contentPanel.add(mapContainer);
		frame.add(contentPanel);
		frame.pack();
	}	
}












