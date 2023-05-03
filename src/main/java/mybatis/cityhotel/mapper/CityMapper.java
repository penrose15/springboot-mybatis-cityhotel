package mybatis.cityhotel.mapper;

import mybatis.cityhotel.domain.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CityMapper {
    List<City> getAllCities();
    Optional<City> getCityById(Long id);
    void insertCity(City city);
    void updateCity(City city);
    void deleteCity(Long id);
}
