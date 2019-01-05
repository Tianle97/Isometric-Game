package ie.gmit.sw;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

/*
 * read img from specific directory, with singleton
 */
public class BufferedImgReader implements ImgReader {
    private static BufferedImgReader instance;

    protected BufferedImgReader() {
    }

    public static ImgReader getInstance(){
        if (instance == null) return new BufferedImgReader();
        else return instance;
    }

    public BufferedImage[] loadBufferedImages(String directory, BufferedImage[] img) throws Exception {
        File dir = new File(directory);
        File[] files = dir.listFiles();
        Arrays.sort(files, (s, t) -> s.getName().compareTo(t.getName()));

        img = new BufferedImage[files.length];
        for (int i = 0; i < files.length; i++) {
            img[i] = ImageIO.read(files[i]);
        }
        return img;
    }

    @Override
    public Image[] loadImages(String directory, Image[] img) {
        return null;
    }
}
