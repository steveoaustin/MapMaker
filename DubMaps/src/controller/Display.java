package controller;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * Display mimics static class behavior to be used by all GUI components that need 
 * information about the current screen dimensions. Holds screen width and height information,
 * and the maximum and minimum scaling ratios for GUI images
 */
public final class Display {

	// scale ratios in the form of image pixels to screen pixels 
	private static final double MIN_IM_PX_RATIO = 1.0, MAX_IM_PX_RATIO = 4.0;
	private static GraphicsDevice screen = 
			GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	private static int screenWidth = screen.getDisplayMode().getWidth();
	private static int screenHeight = screen.getDisplayMode().getHeight();
	private static String mapImage;
	private static String mapFile;
	
	// private constructor mimics static class behavior
	private Display() {}
	
	/**
	 * Sets the map image file path to mapImage
	 * @param mapImage: file path of the map's image
	 */
	public static void setMapImage(String mapImage) {
		Display.mapImage = mapImage;
	}
	
	/**
	 * Returns the map image's file path as a string
	 * @return the image's file path
	 */
	public static String getMapImage() {
		return mapImage;
	}
	
	/**
	 * Sets the map data files prefix to mapFile
	 * @param mapFile: the file prefix as a string
	 */
	public static void setMapFile(String mapFile) {
		Display.mapFile = mapFile;
	}
	
	/**
	 * Returns the map data files prefix as a string
	 * @return the map data files prefix
	 */
	public static String getMapFile() {
		return mapFile;
	}
	
	/**
	 * returns the maximum scale ratio
	 * @return MAX_SCALE_RATIO: the max ratio for image pixels to screen pixels 
	 */
	public static double maxRatio() {
		return MAX_IM_PX_RATIO;
	}
	
	/**
	 * returns the minimum scale ratio
	 * @return MIN_SCALE_RATIO: the min ratio for image pixels to screen pixels 
	 */
	public static double minRatio() {
		return MIN_IM_PX_RATIO;
	}
	
	/**
	 * updates and returns the current screen's width
	 * @return screen width as an integer
	 */
	public static int getWidth() {	
		screenWidth = screen.getDisplayMode().getWidth();
		return (int) screenWidth;
	}
	
	/**
	 * updates and returns the current screen's height
	 * @return screen height as an integer
	 */
	public static int getHeight() {
		screenHeight = screen.getDisplayMode().getHeight();
		return (int) screenHeight;
	}
}
