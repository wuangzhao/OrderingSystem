package com.angzhao.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class pictureUtil {

    public static void cutImage(InputStream inputStream, int w, int h, String path, String formatName) throws IOException {
        BufferedImage bufImg = ImageIO.read(inputStream);
        //新生成结果图片
        BufferedImage zoomImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        //缩放 getScaledInstance(width,height,hints)
        zoomImg.getGraphics().drawImage(bufImg.getScaledInstance(w, h, Image.SCALE_SMOOTH), 0, 0, null);
        ImageIO.write(zoomImg, formatName, new File(path));
    }
}
