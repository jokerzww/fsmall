import org.junit.Test;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;

import static com.fsteam.fsmall.mapper.ItemDynamicSqlSupport.iconId;
import static com.fsteam.fsmall.mapper.ItemDynamicSqlSupport.item;
import static com.fsteam.fsmall.mapper.PictureDynamicSqlSupport.picture;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

public class ItemTest {
    @Test
    public void testDeleteStatement() {
        int item_id = 1;
        DeleteStatementProvider deleteIcon = deleteFrom(picture)
                .where(picture.id, isEqualTo(
                        select(iconId).from(item).where(item.id, isEqualTo(item_id))
                )).build().render(RenderingStrategies.MYBATIS3);
        System.out.println(deleteIcon.getDeleteStatement());
    }
}
