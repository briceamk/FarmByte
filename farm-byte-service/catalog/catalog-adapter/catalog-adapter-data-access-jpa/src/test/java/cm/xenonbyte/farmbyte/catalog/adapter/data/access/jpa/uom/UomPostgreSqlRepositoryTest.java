package cm.xenonbyte.farmbyte.catalog.adapter.data.access.jpa.uom;

import cm.xenonbyte.farmbyte.catalog.adapter.data.access.jpa.PostgreSqlRepositoryTest;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.Name;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.UomType;
import cm.xenonbyte.farmbyte.catalog.domain.core.uomcategory.UomCategoryId;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;

import java.util.UUID;

/**
 * @author bamk
 * @version 1.0
 * @since 07/08/2024
 */
@ContextConfiguration(classes = {UomJpaRepository.class, UomJpaMapper.class})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UomPostgreSqlRepositoryTest extends PostgreSqlRepositoryTest {

    @Autowired
    private UomJpaRepository uomJpaRepository;

    @Autowired
    private UomJpaMapper uomJpaMapper;

    @BeforeEach
    void setUp() {

        uomCategoryId = new UomCategoryId(UUID.fromString("01912c0f-2fcf-705b-ae59-d79d159f3ad0"));
        uomType =  UomType.REFERENCE;
        name = Name.of("Unite");

        super.uomRepository = new UomPostgreSqlRepository(uomJpaRepository, uomJpaMapper);

    }


}
