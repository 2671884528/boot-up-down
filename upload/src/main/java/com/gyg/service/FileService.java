package com.gyg.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 郭永钢
 */

public interface FileService {
	/**
	 * 文件服务，文件上传到OSS对象存储
	 *
	 * @param multipartFile
	 * @return
	 */
	boolean uploadFileToOSS(MultipartFile multipartFile);

	boolean uploadFileToNative(MultipartFile multipartFile) throws IOException;
}
