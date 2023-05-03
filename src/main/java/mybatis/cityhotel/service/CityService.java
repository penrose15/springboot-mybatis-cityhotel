package mybatis.cityhotel.service;

import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.dao.CityDAO;
import mybatis.cityhotel.domain.City;
import mybatis.cityhotel.dto.CityUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityDAO cityDAO;

    public List<City> getAllCities() {
        return cityDAO.getAllCities();
    }

    public City getCityById(Long id) {
        return cityDAO.getCityById(id)
                .orElseThrow(() -> new RuntimeException("null!"));
    }

    public void insertCity(String city) {
        City city1 = City.builder()
                .name(city)
                .build();
        cityDAO.insertCity(city1);
    }

    public void updateCity(CityUpdateDTO dto) {

        cityDAO.updateCity(dto.toEntity());
    }

    public void deleteCity(Long id) {
        cityDAO.deleteCity(id);
    }


}
