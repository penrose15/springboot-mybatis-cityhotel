package mybatis.cityhotel.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hotel {
    private Long id;
    private String name;
    private Long cityId;

    @Builder
    public Hotel(Long id, String name, Long cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
    }

    public void updateHotel(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
