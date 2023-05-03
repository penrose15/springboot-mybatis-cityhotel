package mybatis.cityhotel.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class City {
    private Long id;
    private String name;

    @Builder
    public City(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
