package mybatis.cityhotel.dto;

import lombok.Getter;
import mybatis.cityhotel.domain.Hotel;

@Getter
public class HotelDTO {
    String hotel;
    Long cityId;

    public Hotel toEntity() {
        return Hotel.builder()
                .name(this.hotel)
                .cityId(cityId)
                .build();
    }
}
