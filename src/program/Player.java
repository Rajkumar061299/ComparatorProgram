package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static void sortTheScore(List<Player> list) {

		/*
		 * list.sort(new Comparator<Player>() {
		 * 
		 * @Override public int compare(Player o1, Player o2) {
		 * 
		 * if(o1.getScore()==o2.getScore()) { return
		 * o1.getName().compareTo(o2.getName()); }
		 * 
		 * return o2.getScore()-o1.getScore(); }
		 * 
		 * });
		 */

		list.sort((p1, p2) -> {
			if (p1.getScore() == p2.getScore())
				return p1.getName().compareTo(p2.getName());
			return p2.getScore() - p1.getScore();

		});
		for (Player player : list) {
			System.out.println(player.getName() + "-----" + player.getScore());
		}
	}

	public static void main(String[] args) {

		List<Player> list = new ArrayList<>();
		list.add(new Player("Gayle", 1903));
		list.add(new Player("John", 1791));
		list.add(new Player("Andy", 1400));
		list.add(new Player("Davis", 1400));
		list.add(new Player("Tobin", 1903));

		sortTheScore(list);
	}

	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}
