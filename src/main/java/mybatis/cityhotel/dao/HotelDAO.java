package mybatis.cityhotel.dao;

import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.domain.Hotel;
import mybatis.cityhotel.mapper.HotelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class HotelDAO {
    private final HotelMapper hotelMapper;

    public List<Hotel> getAllHotels() {
        return hotelMapper.getAllHotels();
    }

    public List<Hotel> getAllHotelsByCityId(String cityId) {
        return hotelMapper.getAllHotelsByCityId(cityId);
    }

    public Hotel getHotelById(Long id) {
        return hotelMapper.getHotelById(id);
    }

    public void insertHotel(Hotel hotel) {
        hotelMapper.insertHotel(hotel);
    }

    public void updateHotel(Hotel hotel) {
        hotelMapper.updateHotel(hotel);
    }

    public void deleteHotel(Long id) {
        hotelMapper.deleteHotel(id);
    }
}
