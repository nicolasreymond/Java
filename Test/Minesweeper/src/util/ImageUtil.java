package util;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public abstract class ImageUtil
{
	public static ImageIcon getImageIcon(Object obj, String path)
	{
		return new ImageIcon(obj.getClass().getResource("resource/" + path));
	}
	
	public static BufferedImage getImage(Object obj, String path)
	{
		try
		{
			return ImageIO.read(obj.getClass().getResource("resource/" + path));
		}
		catch (Exception ex)
		{
			System.out.println("L'image n'a pas pu �tre charg�e : " + ex.getMessage());
			return null;
		}
	}

	/**
	 * les fichiers ressources sont stock�s dans un dossier s�par�
	 * ces fichiers ne font pas partie des fichiers de classes
	 * Chaque classe a la charge d'y acc�der et d'interpr�ter les donn�es de la ressource.
	 * O� se trouvent les ressources???
	 * 1- Chargeur de classes -> this.getClass() sait comment trouver le .class
	 *                           charge la classe qui doit acc�der � la ressource
	 * 2- Chargeur de ressources -> getRessource() interpr�te le path relatif
	 */ 
}