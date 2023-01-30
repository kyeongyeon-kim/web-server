package web06;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class MyRequestListener 
		implements ServletRequestListener, ServletRequestAttributeListener {
	// 사용자의 기록  == log라고 부름 , 로그를 남기는 객체를 logger라고 부름
	// 기록을 남기는데에 있어서 외부 라이브러리를 사용한다면 ..
	// SLF4J 
	
	private static final Logger logger = LoggerFactory.getLogger(MyRequestListener.class);
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// 로거의 다양한 메시지 활용 (레벨별로 메시지를 남길 수 있음 ex) info, debug ...)
		// error > warn > info > debug > trace
		logger.info("사용자의 요청 객체 생성됨");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		logger.info("사용자 요청 객체에 attribute값이 설정됨");
		logger.info(srae.getName() + " : " + srae.getValue());
	}
}
