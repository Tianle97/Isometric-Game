package ie.gmit.sw;

import ie.gmit.sw.GameViewModels.GameViewModel;
import ie.gmit.sw.GameViewModels.GameViewModelFactory;
import ie.gmit.sw.listener.GameLevelListener;
import ie.gmit.sw.listener.GameSpriteListener;
import ie.gmit.sw.models.GameAttr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GameWindow {
	// game attribute
	private GameAttr gameAttr = new GameAttr();

	// get one GameviewModel
	GameViewModel gameViewModel = GameViewModelFactory.createGameViewTwo();
	// GameViewModel gameViewModel2 = GameViewModelFactory.createGameViewOne(); // get another model


	public GameWindow() throws Exception {
		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		JLabel l1 = new JLabel();
		l1.setText("select game level:");
		JLabel l2 = new JLabel();
		l2.setText("select game sprite:");
		JRadioButton r1 = new JRadioButton();
		r1.setText("level 1");
		JRadioButton r2 = new JRadioButton();
		r2.setText("level 2");
		JRadioButton s1 = new JRadioButton();
		s1.setText("Default");
		JRadioButton s2 = new JRadioButton();
		s2.setText("Knight");
		JRadioButton s3 = new JRadioButton();
		s3.setText("Green");
		JRadioButton s4 = new JRadioButton();
		s4.setText("Person");
        // add radio button to groups
		ButtonGroup groupOne = new ButtonGroup();
		groupOne.add(r1);
		groupOne.add(r2);
		ButtonGroup groupTwo = new ButtonGroup();
		groupTwo.add(s1);
		groupTwo.add(s2);
		groupTwo.add(s3);
		groupTwo.add(s4);
		JButton b1 = new JButton("Start Game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add listener
		r1.addActionListener(new GameLevelListener());
		r2.addActionListener(new GameLevelListener());
		s1.addActionListener(new GameSpriteListener());
		s2.addActionListener(new GameSpriteListener());
		s3.addActionListener(new GameSpriteListener());
		s4.addActionListener(new GameSpriteListener());
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					startGame();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		// set layout
		f.setLayout( new GridLayout(9,1,2,2));
		f.add(l1);
		f.add(r1);
		f.add(r2);
		f.add(l2);
		f.add(s1);
		f.add(s2);
		f.add(s3);
		f.add(s4);
		f.add(b1);
		f.setSize(300, 500);
		f.setLocation(100, 100);
		f.setVisible(true);

	}
	
	public void startGame() throws Exception {
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