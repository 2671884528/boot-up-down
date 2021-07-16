package com.gyg.service.impl;

import com.gyg.config.FileDirConfig;
import com.gyg.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @author 郭永钢
 */

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	FileDirConfig fileDirConfig;


	@Override
	public boolean uploadFileToOSS(MultipartFile multipartFile) {
		return false;
	}

	@Override
	public boolean uploadFileToNative(MultipartFile multipartFile) throws IOException {

		InputStream inputStream = multipartFile.getInputStream();
		File file = new File(fileDirConfig.getDisk()+multipartFile.getOriginalFilename());
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		byte[] bytesCar = new byte[1024];
		int len = 0;
		while ((len = inputStream.read())!=-1){
			fileOutputStream.write(bytesCar,0,len);
		}
		inputStream.close();
		fileOutputStream.close();
		return false;
	}
}
