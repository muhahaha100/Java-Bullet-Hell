package edu.neumont.hellraisers.javabullethell.model.item;

import edu.neumont.hellraisers.javabullethell.model.Coordinate;
import edu.neumont.hellraisers.javabullethell.model.Player;
import javafx.scene.image.Image;

public class Heart extends Item {
	private int amtHealed;

	public Heart(Coordinate location, int amtHealed) {
		super(new Image("heart.png"), location, 32);
		this.amtHealed = amtHealed;
	}

	@Override
	public void onPickup(Player player) {
		player.gainHealth(amtHealed);
	}
}
