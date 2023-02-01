package web06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns = "/file/upload"
	, initParams = {
		@WebInitParam(name = "dest", value = "file")
		})
// 멀티파트폼데이터 형식을 처리할 수 있게 끔 어노테이션 추가
// fileSizeThreshold : 용량이 너무 크면 임시 폴더를 활용한다.
@MultipartConfig(location = "d:\\myfolder", fileSizeThreshold = 1024 * 1024 * 5, maxFileSize = 1024 * 1024 * 50)
public class FileUploadServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(FileUploadServlet.class);
	private IFileSave repo;
	
	// init :  서블릿 생성 시 가장 먼저 호출되어 동작 함
	@Override
	public void init(ServletConfig config) throws ServletException {
		// InitParam의 값만 바꾼다면 사용자가 원하는 동작을 하게끔 할 수 있다.
		String setting = config.getInitParameter("dest");
		if (setting.equals("file")) {
			repo = new FileSaveToAppFolder(config.getServletContext().getRealPath(""));
		} else {
			repo = new FileSaveToMySQL();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자가 업로드한 파일에 대한 정보를 들고있는 객체 Part
		Part part = req.getPart("upload");
		
		// getName 파라미터의 이름
		logger.info(part.getName());
		// 사용자의 파일 이름
		String fileName = part.getSubmittedFileName();
		logger.info(fileName);
		
		for (String name : part.getHeaderNames()) {
			logger.info(name + " : " + part.getHeader(name));
		}
		
		repo.save(part.getSubmittedFileName(), part.getInputStream());
		
	}
}
