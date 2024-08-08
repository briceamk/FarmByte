package cm.xenonbyte.farmbyte.catalog.adapter.rest.api.uom;

import cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom.view.CreateUomViewRequest;
import cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom.view.CreateUomViewResponse;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.Active;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.Name;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.Ratio;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.Uom;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.UomId;
import cm.xenonbyte.farmbyte.catalog.domain.core.uom.UomType;
import cm.xenonbyte.farmbyte.catalog.domain.core.uomcategory.UomCategoryId;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-08T23:46:15+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Homebrew)"
)
@Component
public class UomRestViewMapperImpl implements UomRestViewMapper {

    @Override
    public Uom toUom(CreateUomViewRequest createUomViewRequest) {
        if ( createUomViewRequest == null ) {
            return null;
        }

        Name name = null;
        Ratio ratio = null;
        UomCategoryId uomCategoryId = null;
        UomType uomType = null;

        name = createUomViewRequestToName( createUomViewRequest );
        ratio = createUomViewRequestToRatio( createUomViewRequest );
        uomCategoryId = createUomViewRequestToUomCategoryId( createUomViewRequest );
        uomType = toUomType1( createUomViewRequest.getUomType() );

        UomId uomId = null;
        Active active = null;

        Uom uom = new Uom( uomId, name, uomCategoryId, uomType, ratio, active );

        return uom;
    }

    @Override
    public CreateUomViewResponse toCreateUomViewResponse(Uom uomResponse) {
        if ( uomResponse == null ) {
            return null;
        }

        CreateUomViewResponse createUomViewResponse = new CreateUomViewResponse();

        createUomViewResponse.setId( uomResponseUomIdIdentifier( uomResponse ) );
        createUomViewResponse.setName( uomResponseNameValue( uomResponse ) );
        createUomViewResponse.setRatio( uomResponseRatioValue( uomResponse ) );
        createUomViewResponse.setActive( uomResponseActiveValue( uomResponse ) );
        createUomViewResponse.setUomCategoryId( uomResponseUomCategoryIdIdentifier( uomResponse ) );
        createUomViewResponse.setUomType( toUomType2( uomResponse.getUomType() ) );

        return createUomViewResponse;
    }

    protected Name createUomViewRequestToName(CreateUomViewRequest createUomViewRequest) {
        if ( createUomViewRequest == null ) {
            return null;
        }

        String value = null;

        value = createUomViewRequest.getName();

        Name name = new Name( value );

        return name;
    }

    protected Ratio createUomViewRequestToRatio(CreateUomViewRequest createUomViewRequest) {
        if ( createUomViewRequest == null ) {
            return null;
        }

        Double value = null;

        value = createUomViewRequest.getRatio();

        Ratio ratio = new Ratio( value );

        return ratio;
    }

    protected UomCategoryId createUomViewRequestToUomCategoryId(CreateUomViewRequest createUomViewRequest) {
        if ( createUomViewRequest == null ) {
            return null;
        }

        UUID identifier = null;

        identifier = createUomViewRequest.getUomCategoryId();

        UomCategoryId uomCategoryId = new UomCategoryId( identifier );

        return uomCategoryId;
    }

    private UUID uomResponseUomIdIdentifier(Uom uom) {
        if ( uom == null ) {
            return null;
        }
        UomId uomId = uom.getUomId();
        if ( uomId == null ) {
            return null;
        }
        UUID identifier = uomId.getIdentifier();
        if ( identifier == null ) {
            return null;
        }
        return identifier;
    }

    private String uomResponseNameValue(Uom uom) {
        if ( uom == null ) {
            return null;
        }
        Name name = uom.getName();
        if ( name == null ) {
            return null;
        }
        String value = name.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private Double uomResponseRatioValue(Uom uom) {
        if ( uom == null ) {
            return null;
        }
        Ratio ratio = uom.getRatio();
        if ( ratio == null ) {
            return null;
        }
        Double value = ratio.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private Boolean uomResponseActiveValue(Uom uom) {
        if ( uom == null ) {
            return null;
        }
        Active active = uom.getActive();
        if ( active == null ) {
            return null;
        }
        Boolean value = active.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private UUID uomResponseUomCategoryIdIdentifier(Uom uom) {
        if ( uom == null ) {
            return null;
        }
        UomCategoryId uomCategoryId = uom.getUomCategoryId();
        if ( uomCategoryId == null ) {
            return null;
        }
        UUID identifier = uomCategoryId.getIdentifier();
        if ( identifier == null ) {
            return null;
        }
        return identifier;
    }
}
