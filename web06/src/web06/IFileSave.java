package web06;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public interface IFileSave {
	void save(String filename, InputStream is) throws IOException;
	
}
