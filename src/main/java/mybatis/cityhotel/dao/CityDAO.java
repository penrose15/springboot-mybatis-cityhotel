package mybatis.cityhotel.dao;

import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.domain.City;
import mybatis.cityhotel.mapper.CityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CityDAO {
    private final CityMapper cityMapper;

    public List<City> getAllCities() {
        return cityMapper.getAllCities();
    }

    public Optional<City> getCityById(Long id) {
        return cityMapper.getCityById(id);
    }

    public void insertCity(City city) {
        cityMapper.insertCity(city);
    }

    public void updateCity(City city) {
        cityMapper.updateCity(city);
    }

    public void deleteCity(Long id) {
        cityMapper.deleteCity(id);
    }
}
