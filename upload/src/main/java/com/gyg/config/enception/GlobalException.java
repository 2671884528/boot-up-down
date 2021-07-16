package com.gyg.config.enception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 郭永钢
 */
@ControllerAdvice
@Slf4j
public class GlobalException {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String printException(Exception e) {
		e.printStackTrace();
		log.info(e.getMessage());
		return "上传失败！";
	}
}
