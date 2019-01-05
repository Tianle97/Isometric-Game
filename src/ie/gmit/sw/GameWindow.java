package ie.gmit.sw;

import ie.gmit.sw.GameViewModels.GameViewModel;
import ie.gmit.sw.GameViewModels.GameViewModelFactory;

import java.awt.*;
import javax.swing.*;
public class GameWindow {
	// get one GameviewModel
	GameViewModel gameViewModel = GameViewModelFactory.createGameViewTwo();
	// GameViewModel gameViewModel2 = GameViewModelFactory.createGameViewOne(); // get another model

	
	public GameWindow() throws Exception {
		GameView view = new GameView(gameViewModel.getModel(), gameViewModel.getObjects());
		Dimension d = new Dimension(GameView.DEFAULT_VIEW_SIZE, GameView.DEFAULT_VIEW_SIZE/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);

		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.add(view);
		f.addKeyListener(view);
		f.setSize(1000, 1000);
		f.setLocation(100, 100);
		f.pack();
		f.setVisible(true);
	}
}