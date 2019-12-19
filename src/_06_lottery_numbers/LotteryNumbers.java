package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	Random ran = new Random();
	int randomNumber = ran.nextInt(5)
	


    if (randomNumber== 0) {
		JOptionPane.showMessageDialog(null, "0");
    }
    if (randomNumber== 1) {
		JOptionPane.showMessageDialog(null, "1");
	}
    if (randomNumber== 2) {
		JOptionPane.showMessageDialog(null, "2");
	}
    if (randomNumber== 3) {
		JOptionPane.showMessageDialog(null, "3");
	}
	
	
}}
