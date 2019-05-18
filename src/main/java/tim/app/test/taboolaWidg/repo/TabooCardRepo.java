package tim.app.test.taboolaWidg.repo;

import org.springframework.data.repository.CrudRepository;
import tim.app.test.taboolaWidg.model.TabooCard;

public interface TabooCardRepo extends CrudRepository<TabooCard, Long> {
}
