package hello.upload.controller;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ItemForm {

	private Long id;
	private String itemName;
	private MultipartFile attachFile;
	private List<MultipartFile> imageFiles;
}
