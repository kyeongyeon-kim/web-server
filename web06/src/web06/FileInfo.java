package web06;

import com.mysql.cj.jdbc.Blob;

public class FileInfo {
	private int id;
	private String uploader;
	private String fileName;
	private Blob file;
	
	public FileInfo(String uploader, String fileName, Blob file) {
		super();
		this.uploader = uploader;
		this.fileName = fileName;
		this.file = file;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	
	
}
