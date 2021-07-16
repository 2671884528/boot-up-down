package com.gyg.controller;

import com.gyg.service.impl.FileServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author 郭永钢
 */
@Controller
public class FileController {
	@Autowired
	FileServiceImpl fileService;

	@PostMapping("/upload")
	@ResponseBody
	public String upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {

		fileService.uploadFileToNative(multipartFile);
		return "上传成功！";
	}

	@GetMapping("/")
	public String index(){
		return "index";
	}
}
