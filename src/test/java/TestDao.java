import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.PhoneDao;
import com.offcn.po.Phone;

public class TestDao {

	public static void main(String[] args) {
     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
     PhoneDao dao = context.getBean(PhoneDao.class);
	
     Phone p = dao.search("1352128");
     System.out.println(p);
	}

}
