package mybatis.cityhotel.dto;

import lombok.Getter;
import mybatis.cityhotel.domain.City;

@Getter
public class CityUpdateDTO {
    private Long id;
    private String name;

    public City toEntity() {
        return City.builder()
                .id(this.id)
                .name(this.name)
                .build();
    }
}
