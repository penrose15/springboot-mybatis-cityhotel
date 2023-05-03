package mybatis.cityhotel.mapper;

import mybatis.cityhotel.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelMapper {
    List<Hotel> getAllHotels();
    List<Hotel> getAllHotelsByCityId(String cityId);
    Hotel getHotelById(Long id);
    void insertHotel(Hotel hotel);
    void updateHotel(Hotel hotel);
    void deleteHotel(Long id);
}
