package web06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;

import javax.servlet.annotation.MultipartConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileSaveToAppFolder implements IFileSave {
	private static final Logger logger = LoggerFactory.getLogger(FileUploadServlet.class);
	private String rootPath;
	
	public FileSaveToAppFolder(String rootPath) {
		super();
		this.rootPath = rootPath;
	}

	@Override
	public void save(String filename, InputStream iputstream) throws IOException {
		logger.info("애플리케이션 root 경로 확인 : " + rootPath);
		Path uploadPath = Paths.get(rootPath, "upload");

		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		Files.copy(iputstream
				, uploadPath.resolve(filename)
				, StandardCopyOption.REPLACE_EXISTING);
	}

}
