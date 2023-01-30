package web06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns = "/file/upload")
// 멀티파트폼데이터 형식을 처리할 수 있게 끔 어노테이션 추가
// fileSizeThreshold : 용량이 너무 크면 임시 폴더를 활용한다.
@MultipartConfig(location = "d:\\myfolder", fileSizeThreshold = 1024 * 1024 * 5, maxFileSize = 1024 * 1024 * 50)
public class FileUploadServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(FileUploadServlet.class);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자가 업로드한 파일에 대한 정보를 들고있는 객체 Part
		String uploader = req.getParameter("uploader");
		Part part = req.getPart("upload");
		
		// getName 파라미터의 이름
		logger.info(part.getName());
		// 사용자의 파일 이름
		String fileName = part.getSubmittedFileName();
		logger.info(fileName);
		
		
		
		
		
		
//		for (String name : part.getHeaderNames()) {
//			logger.info(name + " : " + part.getHeader(name));
//		}
		
		String rootPath = getServletContext().getRealPath("");
		
		
		logger.info("애플리케이션 root 경로 확인 : " + rootPath);
		Path uploadPath = Paths.get(rootPath, "upload");
		File inputFile = new File(uploadPath.toAbsolutePath() + "\\" + fileName);
		FileInputStream ips = new FileInputStream(inputFile);
		
		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		Files.copy(part.getInputStream()
				, uploadPath.resolve(part.getSubmittedFileName())
				, StandardCopyOption.REPLACE_EXISTING);
	}
}
