package com.tuancode.mapper;

import com.tuancode.entity.ClaimEntity;
import com.tuancode.service.dto.ClaimDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClaimMapper {

    /*
    @Mapping: chỉ định rằng thuộc tính tại target
            sẽ được set dữ liệu từ thuộc tính tại source
    source: thuộc tính dùng lấy để lấy data, thuộc tính
            đấy được lấy trong param truyền vào( ClaimEntity)
    target: thuộc tính sẽ nhận data, được set vào class được
            trả về (ClaimDTO)
    */
    @Mapping(source = "customerEntity.name", target = "customerName")
    @Mapping(source = "insuranceProductEntity.name", target = "nameProduct")
    @Mapping(source = "insuranceProductEntity.coverage", target = "coverageProduct")
    @Mapping(source = "claimStatusEntity.description", target = "statusName")
    ClaimDTO toDto(ClaimEntity claimEntity);
}
