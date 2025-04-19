package com.tuancode.mapper;

import com.tuancode.entity.UserEntity;
import com.tuancode.mapper.decorator.UserMapperDecorator;
import com.tuancode.service.dto.UserDTO;
import java.util.List;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(UserMapperDecorator.class)
public interface UserMapper {

  UserEntity toUserEntity(UserDTO userDTO);
  // tự động nó sẽ convert hết tất cả những thằng private fields cùng tên vào đây cho mình

  UserDTO toUserDTO(UserEntity userEntity);

  List<UserDTO> toDTO(List<UserEntity> userEntities);
}
