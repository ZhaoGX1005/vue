import com.ruoyi.generator.domain.GenTable;
import com.ruoyi.generator.mapper.GenTableMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class mapperTest {
    @Autowired
    private GenTableMapper mapper;
    @Test
    public void find(){
        for (GenTable table : mapper.selectGenTableAll()) {
            System.out.println(">>>>>>>>>>>>>"+table);
        }

    }
}
