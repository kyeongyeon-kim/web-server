package web06;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// HttpSessionListener 세션이 만들어지고, 파괴될 때 이벤트 발생
// HttpSessionIdListener 세션ID가 만들어지고, 사라지고
// HttpSessionAttributeListener 세션영역에 어트리뷰트값 설정시 이벤트 발생

@WebListener
public class MysessionListener 
	implements HttpSessionIdListener, HttpSessionAttributeListener, HttpSessionListener {
	private static final Logger logger = LoggerFactory.getLogger(MyRequestListener.class);
	
	@Override
	public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
		logger.info("세션 아이디 변경됨 : " + oldSessionId + " >> " + event.getSession().getId());
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		logger.info("세션 생성됨 : " + se.getSession().getId());
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		logger.info("세션 어트리뷰트 설정됨 : " + event.getName() + " : " + event.getValue());
	}

	
}
