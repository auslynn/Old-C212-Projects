// Austin Lynn, auslynn
// 1/30/20

import java.awt.Component;

import javax.swing.JFrame;

public class DrawFrames {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setTitle("pictureFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MakeShapes image = new MakeShapes();
		frame.add(image);
		frame.setVisible(true);
		
	}
	
}
