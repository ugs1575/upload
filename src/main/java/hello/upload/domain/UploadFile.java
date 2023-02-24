package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

	private String uploadFileName;
	private String storeFileName; //파일 이름 같으면 덮어짐

}
