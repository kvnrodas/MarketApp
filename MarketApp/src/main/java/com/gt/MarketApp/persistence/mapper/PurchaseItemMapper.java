package com.gt.MarketApp.persistence.mapper;

import com.gt.MarketApp.domain.PurchaseItem;
import com.gt.MarketApp.persistence.entity.ComprasProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mappings({
                @Mapping(source="id.idProducto", target="productId"),
                @Mapping(source="",target=""),
                @Mapping(source="",target=""),
                @Mapping(source="",target=""),
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);



}
