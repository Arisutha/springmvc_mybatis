import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.suta.mybatis.model.Categori;
import com.suta.mybatis.service.CategoriService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
public class CategoriControllerTest {

	@Autowired
	private CategoriService categoriService;
	
	public void testGetAllCategori() {
		List<Categori> list = this.categoriService.getAllCategori();
		assertEquals(1, list.size());
	}
	
}
