package interpolation;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class SaveMatrixImage {
	/**
	 * @param matrix
	 *            ����
	 * @param filedir
	 *            �ļ�·������,d:\\test.jpg
	 * @throws IOException
	 */
	public static void createMatrixImage(double[][] matrix, String filedir) throws IOException {
		int cx = matrix.length;
		int cy = matrix[0].length;
		// �����θ߿�
		// int cz = 10;
		// // ����ͼ�Ŀ��
		// int width = cx * cz;
		// // ����ͼ�ĸ߶�
		// int height = cy * cz;

		OutputStream output = new FileOutputStream(new File(filedir));
		// BufferedImage bufImg = new BufferedImage(width, height,
		// BufferedImage.TYPE_INT_RGB);
		BufferedImage bufferedImage = new BufferedImage(cx, cy, BufferedImage.TYPE_INT_RGB);
		double maxValue = 0;
		double minValue = 255;
		for (int i = 0; i < cx; i++) {
			for (int j = 0; j < cy; j++) {
				if (matrix[i][j] > maxValue) {
					maxValue = matrix[i][j];
				}
				if (matrix[i][j] < minValue) {
					minValue = matrix[i][j];
				}
			}
		}
		for (int i = 0; i <cx; i++) {
			for (int j =cy-1; j >=0; j--) {
				int valueColor=(int) (matrix[i][j] * 16777216 / (maxValue - minValue));
				bufferedImage.setRGB(i, j, valueColor);// ��������
			}
		}

		bufferedImage.flush();
		// ����ļ�
		ImageIO.write(bufferedImage, "jpeg", output);
	}
	
	
	

}