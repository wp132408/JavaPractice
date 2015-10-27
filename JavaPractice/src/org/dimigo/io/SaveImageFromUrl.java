/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *    ㅣ_SaveImageFromUrl
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String imageUrl = "https://lunaextrema.files.wordpress.com/2011/11/gnfn.png";
		
		try{
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			//파일에 write하기
			int result;
			
			byte[]buf = new byte[100];
			
			while((result = is.read(buf)) != -1)
			{
				os.write(buf, 0, result);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
