package mybatis.cityhotel.service;

import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.dao.HotelDAO;
import mybatis.cityhotel.domain.City;
import mybatis.cityhotel.domain.Hotel;
import mybatis.cityhotel.dto.HotelDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelDAO hotelDAO;

    public List<Hotel> getAllHotels() {
        return hotelDAO.getAllHotels();
    }

    public List<Hotel> getAllHotelsByCityId(Long cityId) {
        return hotelDAO.getAllHotelsByCityId(cityId.toString());
    }

    public Hotel getHotelById(Long id) {
        return hotelDAO.getHotelById(id);
    }

    public void insertHotel(HotelDTO dto) {
        hotelDAO.insertHotel(dto.toEntity());
    }

    public void updateHotel(Long id, String name) {
        Hotel hotel = getHotelById(id);

        hotel.updateHotel(name);

        hotelDAO.updateHotel(hotel);
    }

    public void deleteHotel(Long id) {
        hotelDAO.deleteHotel(id);
    }
}
