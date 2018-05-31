package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.Level;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {

		Level level = new Level();
		ModelFacade model = new ModelFacade(level);
		ViewFacade view = new ViewFacade(level);
		model.addObserver(view.getFrame().getObserver());
		final ControllerFacade controller = new ControllerFacade(view, model);

		try {
			controller.start();
		} catch (final SQLException exception) {
			exception.printStackTrace();
		}
	}

}
